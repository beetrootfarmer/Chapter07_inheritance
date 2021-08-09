package ch07_4_abstract_class;

//규격 클래스 
abstract class Phone {
	//필드
	public String owner;
	//생성자 
	public Phone(String owner) {
		this.owner = owner;
	}
	// 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}

class SmartPhone extends Phone {
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	//메소드 
	public void internretSearch() {
		System.out.println("인터넷을 검색합니다");
	}
}
public class PhoneExample {
	public static void main(String[] args) {
//		Phone p1 = new Phone("");
		SmartPhone p1 = new SmartPhone("");
	
		p1.turnOn();
		p1.internretSearch();
		p1.turnOff();
		
	}
}
