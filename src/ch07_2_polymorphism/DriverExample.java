package ch07_2_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(bus); // drive(Vehicle ve)메소드를 호출해서 자료형이 Vehicle인 상태
		driver.drive(taxi);
		
		Vehicle ve = new Bus(); // Bus의 조상이 Vehicle이기 때문에 호출 가능하다..
	}
}
