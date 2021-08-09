package ch07_4_abstract_class;

abstract class HttpServlet {
	public abstract void service();
}

class LoginServlet extends HttpServlet {
	@Override
	public void service() {
		System.out.println("로그인 합니다.");
	}
}

class FileDownServlet extends HttpServlet {
	@Override
	public void service() {
		System.out.println("파일 다운로드합니다.");
	}
}

public class HttpServletExample {
	public static void main(String[] args) {
		메소드(new LoginServlet()); // LoginServlet 자료형의 인스턴스가 만들어지고 참조값이 method로 전달된다
		메소드(new FileDownServlet()); // new FileDownServlet() 은  FileDownServlet자료형의 인스턴스 주소값
	}
	public static void 메소드(HttpServlet servlet) { // 12줄의 메소드 구현, HttpServlet자료형의 ...
		servlet.service(); // 메소드 실행
	}
 }
