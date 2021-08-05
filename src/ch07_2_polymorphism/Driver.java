package ch07_2_polymorphism;

public class Driver {
	public void drive(Vehicle v) { // drive(클래스 자료형 	매개변수 이름) <- control code에서 호출해서 사용할 수 있게 
		v.run();
	}

}
