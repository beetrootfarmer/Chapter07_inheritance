package ch07_1_inheritance;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1; //상수 대문자 , 자주사용되는 고정값은 상수선
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() { //fly method 재정
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다");
	}else {
		super.fly(); //부모의 메소드 호출해 그대로 쓰는거 
	}
 }
}
