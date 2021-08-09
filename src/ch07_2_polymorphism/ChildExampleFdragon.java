package ch07_2_polymorphism;

class Parent {
	// 필드
	String p_str = "Parent String ......";

	// 생성자
	// 메소드
	void print() {
		System.out.println(p_str);
	}
}

class Child extends Parent {
	// 필드
	String c_str = "Child String ......";

	// 생성자
	// 메소드
	@Override 					// ctrl + shift 해서 선택하거나 복붙
	void print() {
		display();				// 자식클래스에서 재정의 해서 사용하기
	}

	void display() {
		System.out.print(c_str);
		System.out.println('★');
		
	}
}

public class ChildExampleFdragon {
	public static void main(String[] args) {
//		 객체생성
		Child c = new Child();
		c.print();
	}
}
