package ch07_3_polymorphism_ex;

class MobilePhone {
	//필드
	protected String number; 	//전화번호
//public/ protected/ default/ private
	//생성자
	public MobilePhone(String number) {
		this.number = number;
		//필드 초기화 
	}
	//메소드	
	public void receive() {
		System.out.println("하이~ from " + this.number);
	}
}

class SmartPhone extends MobilePhone {
//	String number;
//	receive()
//	send() 		이렇게 쓰지 않고 상속 
	//필드
	private String androidVer;
	//생성자  
	public SmartPhone(String num, String ver) { // String num은부모 생성자 자료형 
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

public class MobileSmartPhone {
	public static void main(String[] args) {
		
		// 스마트폰 객체생성
		SmartPhone phone = new SmartPhone("000-0000-1111", "Android 7.0");
		// 전화걸기
		phone.send("010-8888-9999");
		// 전화받기
		phone.receive();
		// 앱을 선택하여 실행하기
		phone.plapApp();
		
	}
}