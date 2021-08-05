package ch07_2_polymorphism;

class Parent_ {
	String field1;
	void method1() {
		System.out.println("Parent-method1()");
	}
	void method2() {
		System.out.println("Parent-method2()");
	}
}
class Child_ extends Parent_ {
	String field2;
	void method3() {
		System.out.println("Child-method3()");
	}
}
public class ChildExample2 {
	public static void main(String[] args) {
		Parent_ parent = new Child_();
		parent.method1();
		parent.method2();
		
//		parent.field2;
//		parent.method3();
		
		Child_ child = (Child_)parent; // 강제 형변환
//		child. 하면 child와 parent 메소드 모두 접근가능하다
		child.field2 = "yyy";
		child.method3();
	}

}
