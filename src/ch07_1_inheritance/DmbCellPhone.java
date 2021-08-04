package ch07_1_inheritance;

public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
//	CellPhone cell; 상속받지 않고 필드 내부 기능으로 사용할 수도 있음. is와 has의 차.
//	상속은 is a 관계, 필드에 들어가면 has a 관계.
	
	//생성자
	DmbCellPhone(String model, String color, int channel) {// 상속을 받으면 생성자에 ..?
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드 
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}

}
