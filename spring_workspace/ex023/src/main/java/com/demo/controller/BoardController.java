package com.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.domain.BoardVO;
import com.demo.domain.Criteria;
import com.demo.domain.PageDTO;
import com.demo.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

// 게시판 기능에 사용할 URL 매핑 주소를 구성요소로 하는 컨트롤러 기능의 클래스
// BoardController에서는 BoardServiceImpl의 메서드를 호출한다.
/*
[참고] servlet-context.xml 파일 
<context:component-scan base-package="com.demo.controller" />는 자동 추가됨
*/
// pom.xml 파일에서 <groupId>log4j</groupId> 위치의 <scope>runtime</scope>을 주석 처리해야 @Log4j 사용 가능
@Log4j // log 객체 지원 해줌	
@Controller // servlet-context.xml
@RequestMapping("/board/*")	// views 폴더 밑에 board 폴더 생성
@RequiredArgsConstructor
public class BoardController {
	
	// BoardServiceImpl 대신 필드의 다형성으로 인해 BoardService로 써도 된다.
	private final BoardService boardService;
	
	/*
	@RequiredArgsConstructor으로 인해 아래와 같이 동작하기 때문에 굳이 작성할 필요 없음

	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	*/

	// private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	// 매핑주소: /board/register
	// 글쓰기 폼
	@GetMapping("/register")
	public void register() {

		log.info("called register...");
	}
	
	// 매핑주소: /board/register
	// 저장 버튼 클릭 후 글쓰기 저장
	@PostMapping("/register")
	public String register(BoardVO board) {
	
		log.info("게시판 입력 데이터: " + board); // board.toString() 호출
		
		// DB 저장 작업 순서
		/*
		1) BoardMapper 인터페이스와 BoardMapper.xml 작업
		2) BoardService 인터페이스와 BoardServiceImpl 작업
		3) BoaedCotroller 클래스 파일 작업
		*/
		
		boardService.register(board);
				
		return "redirect:/board/list"; // 주소는 절대 경로로 작성해야 함 
	}
	
	// [기존 작업] 목록 -> [심화 작업](하단 내용 참고)
	// 매핑주소: /board/list
	// Model model: jsp 파일에 데이터(대부분 DB)를 출력하고자 할 때
	/*
	@GetMapping("/list")
	public void list(Model model) {
		
		// DB 작업
		
		// 서비스 메서드 호출
		List<BoardVO> list = boardService.getList();
		// model.addAttribute(attributeName=list.JSP 내부 items="${list}"에서 사용할 이름, attributeValue=데이터);
		model.addAttribute("list", list); // JSP 작업 진행 
	}
	*/
	
	// [심화 작업]
	// 스프링이 Criteria 클래스의 기본 생성자를 호출하여 객체를 자동으로 생성해준다.
	// Criteria cri = new Criteria(); Model model = new 생성자();
	// Model model: jsp 파일에 데이터(대부분 DB)를 출력하고자 할 때
	@GetMapping("/list")
	public void list(Criteria cri, Model model) {
		
		log.info("list: " + cri); // cri.toString();
		// Criteria(pageNum=1, amount=10, type=null, keyword=null)
		
		// DB 작업
		
		// 서비스 메서드 호출
		// 1) 목록 데이터 - List<BoardVO>
		List<BoardVO> list = boardService.getListWithPaging(cri);
		model.addAttribute("list", list);
		
		// 2) 페이징 기능 - PageDTO 
		int total = boardService.getTotalCount(cri); // 테이블의 데이터 전체 개수
		
		log.info("데이터 총 개수: " + total);
		
		PageDTO pageDTO = new PageDTO(cri, total);
		model.addAttribute("pageMaker", pageDTO);
		
		// 페이징 정보: PageDTO(startPage=1, endPage=10, prev=false, next=true, total=2048, cri=Criteria(pageNum=1, amount=10, type=null, keyword=null))
		log.info("페이징 정보: " + pageDTO);
	}
	
	// 매핑 주소: /board/get?bno=게시물번호
	// 게시물 읽기(상세 내용): 리스트에서 제목을 클릭했을 때, 게시물 번호에 데이터를 출력
	// 수정 폼
	// model.addAttribute("", );와  @ModelAttribute("")는 유사한 기능
	@GetMapping({"/get", "/modify"})
	public void get(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		
		// 목록에서 선택한 게시물 번호
		log.info("게시물 번호: " + bno);
		
		// 페이징과 검색 정보
		log.info("페이징과 검색 정보: " + cri);
		
		BoardVO board = boardService.get(bno);
		model.addAttribute("board", board);
	}
	
	// 매핑 주소: /board/modify
	// 수정하기 
	// RedirectAttributes: 페이지(주소) 이동 시 파라미터 정보를 제공하는 목적으로 사용
	@PostMapping("/modify")
	public String modify(BoardVO board, Criteria cri, RedirectAttributes rttr) {
		
		log.info("수정 데이터: " + board);
		log.info("Criteria: " + cri);
		
		// DB 저장
		boardService.modify(board);
		
		// 검색과 페이지 정보를 이동주소(/board/list)의 파라미터로 사용하기 위한 작업
		/*
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		rttr.addAttribute("type", cri.getType());	
		rttr.addAttribute("keyword", cri.getKeyword());	
		*/
		
		// /board/list?pageNum=값&amount=값&type=값&keyword=값
		return "redirect:/board/list" + cri.getListLink(); // list(Criteria cri, Model model)
	}
	
	// 매핑 주소: /board/delete
	// 삭제하기: 수정하기와 같은 원리로 작동(다만, 하나가 삭제될 뿐)
	@GetMapping("/delete")
	public String delete(@RequestParam("bno") Long bno, Criteria cri, RedirectAttributes rttr) {
		
		log.info("삭제할 번호: " + bno);
		// log.info("Criteria: " + cri);
		
		// DB 작업
		boardService.delete(bno);
		
		// 검색과 페이지 정보를 이동주소(/board/list)의 파라미터로 사용하기 위한 작업
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		rttr.addAttribute("type", cri.getType());	
		rttr.addAttribute("keyword", cri.getKeyword());
		
		return "redirect:/board/list";
	}
}
