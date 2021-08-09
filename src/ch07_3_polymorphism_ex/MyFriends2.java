package ch07_3_polymorphism_ex;
class Friend {
	//필드 
	public String name; // private으로 해서 Getter.Setter로 만들
	public String phone;
	//생성자
	public Friend(String na, String ph) {
		name = na;
		phone = ph;
	}
	//메소드 
	public void showInfo () {
		System.out.println("이름: " + name);
		System.out.println("번호: " + phone);
	
	}
}
//대학친구 
class UnivFriend extends Friend {
	//필드
	private String major;
	
	//생성자
	public UnivFriend(String na,String ma,String ph ) {
		super(na, ph); // 상속받고 
		major = ma; //추가하고 
		
	}
	//메소
	public void showInfo () {
		super.showInfo();
		System.out.println("전공: " + major);
	}
}
//직장동
class CompFriend extends Friend  {
	//필드
	private String department;
	//생성자
	public CompFriend(String na,String de,String ph) {
		super(na,ph);
		department = de;
	}
	//메소
	public void showInfo () {
		super.showInfo();
		System.out.println("부서: " + department);
	}
	
}
public class MyFriends2 {	
	public static void main(String[] args) {
		
		//친구관리를 위한 배열과 변수
		Friend[] frns = new Friend[6];
		int cnt = 0;

		//대학친구 추가
		frns[cnt++] = new UnivFriend("Lee", "Computer", "010-1");
		frns[cnt++] = new UnivFriend("Kim", "Art", "010-2");
		frns[cnt++] = new UnivFriend("Seo", "Korean", "010-3");
		
		//직장동료  추가
		frns[cnt++] = new CompFriend("An", "Archery", "010-1");
		frns[cnt++] = new CompFriend("Choi", "Crossfit", "010-2");
		frns[cnt++] = new CompFriend("Moon", "Dance", "010-3");
		
		// 친구 목록일괄 출력 	
		for(int i=0; i < frns.length; i++) {
			frns[i].showInfo();
			if (frns[i].name.equals("Kim")) {
				System.out.println("Kim 목록 " + (i+1) + "번째에서 찾았습니다.");
//				break;
			}
			System.out.println();
//			continue;
//녹음파일 12
		}
	}
}
