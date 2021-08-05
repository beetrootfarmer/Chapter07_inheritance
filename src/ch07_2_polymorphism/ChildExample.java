package ch07_2_polymorphism;

class Parent1 {
	String Character;

	public Parent1(String Character) {
		this.Character = Character; 
	}

	public void method1() {
		System.out.println("Parent-method1()");
	}

	public void method2() {
		System.out.println("Parent-method2()");
	}
}

class Child1 extends Parent1 {
	public Child1 (String Character) {
		super(Character);
	}
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}

	public void method3() {
		System.out.println("Child-method3()");
	}
}

public class ChildExample {
	public static void main(String[] args) {

		Child1 child1 = new Child1("쾌활하다");
		Child1 child2 = new Child1("소심하다");

		Parent1 parent = child1; // 부모의 자료형 참조변수로 자식객체의 인스턴스..
		parent = child2;

		parent.method1();
		parent.method2();
//		parent.method3();  // 오류
	}
}
