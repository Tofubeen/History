package com.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.domain.BoardVO;
import com.demo.domain.Criteria;
import com.demo.domain.PageDTO;
import com.demo.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

//게시판 기능에 사용 할 URL 매핑주소를 구성요소로 하는 컨트롤러기능의 클래스
//BoardController에서는 BoardServiceImpl의 메서드를 호출한다
/*
 servlet-context.xml 파일 
   <context:component-scan base-package="com.demo.controller" /> 자동추가됨

 */
//pom.xml 파일에서 <groupId>log4j</groupId> 위치에서	<scope>runtime</scope> 부분 주석처리해야 코드꼬임이 사라짐 . Log4j를 사용하여

@Log4j //log 객체지원 해줌 
@Controller // servlet-context.xml 파일   (Controller 어노테이션이 필수다)
@RequestMapping("/board/*") //board로 시작하는 모든 주소는 BoardController가 맡는다는 의미이다(views 폴더 밑에 board 생성) 
@RequiredArgsConstructor
public class BoardController {
	
	 
	private final BoardService boardService;
	
//	public public BoardController(BoardService boardService) {
//		this.boardService = boardService;
			
	
	//메핑주소 /board/register
	//글쓰기 폼
	@GetMapping("/register")
	public void register() {
		log.info("called register....");
	}
//	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	
	//메핑주소
	//저장버튼 클릭후 글쓰기 저장
	@PostMapping("/register") //board로 사용자 내용이 들어온다 즉, 이 메소드가 하는 작용은 insert 작업이다() 
	public String register(BoardVO board) {
		
		log.info("게시판 입력데이터 : " + board); //board.tostring()  
		//db저장.
		/*
		db저장할려면
		1)BoardMapper 인터페이스와 BoardMapper.xml 작업
		2)BoardService 인터페이스와 BoardService.xml 파일 먼저 작업하고 컨트롤러로 돌아와야 함
		 */
		boardService.register(board);
		
		return "redirect:/board/list";//주소는 절대경로
	} 
	
	/*
	//매핑주소 /board/list
	//목록
	//Model model : jsp파일에 데이터(대부분 DB)를 츨력하고자 할때 
	@GetMapping("/list")
	public void list(Model model) {
		//서비스 메소드 호출   (DB작업) 
		List<BoardVO> list = boardService.getList();
		model.addAttribute("list", list); //jsp 작업 진행
	}
	*/
	
	
	
	//스프링이 Criteria 클래스의 기본생성자를 호출하여 , 객체를 생성해준다 
		@GetMapping("/list")
		public void list(Criteria cri,  Model model) {
			
			log.info("list" + cri); //Cri.ToString
			
			
//			1).목록데이터
			List<BoardVO> list = boardService.getListWithPaging(cri);
			model.addAttribute("list", list);
			
//			2). 페이징기능 PageDTO
			int total = boardService.getTotalCount(cri); //테이블의 데이터 전체 갯수
			
			log.info("데이터 총 갯수 " + total);
			
			PageDTO pageDTO = new PageDTO(cri,total);
			model.addAttribute("pageMaker", pageDTO);
			
			
			log.info("페이징정보" + pageDTO);
		}
	
	//매핑주소 /board/get?bno = 게시물번호
	//게시물읽기: 리스트에서 제목을 클릭했을 때, 게시물번호에 데이터를 출력
	//메소드에 리턴타입이 void 면 리턴타입은 매핑주소가 된다
	//수정폼
	//model은 jsp가 출력할때 필요
		@GetMapping({"/get", "/modify"})
		   public void get(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		      
		      // 목록에서 선택한 게시물 번호
		      log.info("게시물 번호: " + bno);
		      
		      // 페이징과 검색 정보
		      log.info("페이징과 검색 정보: " + cri);
		      
		      BoardVO board = boardService.get(bno);
		      model.addAttribute("board", board);
		   }
	
	
	
	//매핑주소
	//수정하기(뭔가 저장할려하면 void 쓰면 안된다 string 써야한다)
	@PostMapping("/modify")
	public String modify(BoardVO board) {
		
		log.info("수정데이터 " + board);
		
		boardService.modify(board);
		return "redirect:/board/list";
	}
	
	//매핑주소 /board/delete
	@GetMapping("/delete")
	public String delete(@RequestParam("bno") Long bno) {
		
		log.info("삭제할 번호: " + bno);
		
		boardService.delete(bno);
		
		return "redirect:/board/list";
	}
	
	
	
	
}
