package ch07_2_polymorphism;

class Vehicle {
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}
class Taxi extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
class Bus extends Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");	
		}
}
class Driver {
	public void drive(Vehicle v) { // drive(클래스 자료형 	매개변수 이름) <- control code에서 호출해서 사용할 수 있게 
		v.run();
	}
}

public class DriverExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(bus); // drive(Vehicle ve)메소드를 호출해서 자료형이 Vehicle인 상태
		driver.drive(taxi);
		
		Vehicle ve = new Bus(); // Bus의 조상이 Vehicle이기 때문에 호출 가능하다..
		driver.drive(ve);
	}
}
