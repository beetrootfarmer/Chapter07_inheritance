package ch07_3_polymorphism_ex;

class MobilePhone2 {
	//필드
	protected String number; 	//전화번호
//public/ protected/ default/ private
	//생성자
	public MobilePhone2(String number) {
		this.number = number;
		//필드 초기화 
	}
	//메소드	
	public void receive() {
		System.out.println("하이~ from " + this.number);
	}
}

class SmartPhone2 extends MobilePhone2 {
//	String number;
//	receive()
//	send() 		이렇게 쓰지 않고 상속 
	//필드
	private String androidVer;
	//생성자  
	public SmartPhone2(String num, String ver) { // String num은부모 생성자 자료
		super(num);
		androidVer = ver;
//	부모가생성되고 자식것이 생성되어야함 
	}
	//메소드 
	public void send(String number) {
		System.out.println("헬로우 to " + number);
	}
	@Override				//
	public void receive() {
		super.receive();
		System.out.println("I am Smart~"); 
	}
	public void plapApp() {
		System.out.println("App is running in " + androidVer);
	}
}

public class MobileSmartPhone2 {
	public static void main(String[] args) {
		
		// 스마트폰 객체생성
		SmartPhone2 phone1 = new SmartPhone2("000-0000-1111", "Android 7.0");
		MobilePhone2 phone3 = new MobilePhone2("1234");
		
		// 부모클래스의 참조변수(phone2)는 자식클래스(SmartPhone)의 인스턴스 참조가능!!!
//		MobilePhone형 참조변수는 SmartPhone형의 인스턴스를 참조가능!!! 반대는 안된다 54
		MobilePhone2 phone2 = new SmartPhone2("000-0000-2222", "Android 7.0");
		
//		SmartPhone2  phone4 = new MobilePhone2("1234"); //자식 쪽에 부모를 넣어서 오류 
//		SmartPhone2  phone4 = (SmartPhone2) new MobilePhone2("1234"); //강제 형변환  -> 이거 왜 오류?

		phone2.receive();
		
		
		
		// 전화걸기
		phone1.send("010-8888-9999");
//		phone2.send("010-8888-9999"); //phone2의 자료형은 MobilePhone으로 변환되어서 오류

//		// 전화받기
		phone1.receive();
		phone2.receive();
		
//		// 앱을 선택하여 실행하기
		phone1.plapApp();
//		phone2.plapApp(); //phone2의 자료형은 MobilePhone으로 변환되어서 오류

		
		//중요한 것은 부모클래스 참조변수를 자식클래스에서 사용할수있다?
	}
}