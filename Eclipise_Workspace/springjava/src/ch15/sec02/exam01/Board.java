package ch15.sec02.exam01;

//ArrayList 클래스가 제공하는 컬렉션 구조에 저장할 목적
public class Board {
	private String subject;
	private String content;
	private String writer;
	
	//기본ㅅ
	public Board(String subject, String content, String writer) {
//		super(); //컴파일 과정에서 자동생성. 부모클래스의 기본생성자 호출 메소드
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	public String getSubject() {return subject;}
	public void setSubject(String subject) {this.subject = subject;}
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	public String getWriter() {return writer;}
	public void setWriter(String writer) {this.writer = writer;}
	
}
