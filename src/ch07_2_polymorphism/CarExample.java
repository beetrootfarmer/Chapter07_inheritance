package ch07_2_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontLeftTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("뒤왼쪽", 15); // 부모타입의 변수로 자식타입의 객체를 호출(참조)
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.frontLeftTire = new KumhoTire("뒤오른쪽", 15);
				break;
			}
			System.out.println("--------------------------");
		}
	}

}
