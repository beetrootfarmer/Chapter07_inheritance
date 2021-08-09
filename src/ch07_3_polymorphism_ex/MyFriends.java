//import ch07_3_polymorphism_ex.Friend.CompFriend;
//import ch07_3_polymorphism_ex.Friend.UnivFriend;

//package ch07_3_polymorphism_ex;
////대학친
//class UnivFriend {
//	//필드
//	private String name;
//	private String major;
//	private String phone;
//	//생성자
//	public UnivFriend(String na, String ma, String ph) {
//		name = na;
//		major = ma;
//		phone = ph;
//	}
//	//메소
//	public void showInfo () {
//		System.out.println("이름: " + name);
//		System.out.println("전공: " + major);
//		System.out.println("번호: " + phone);
//	}
//}
////직장동
//class CompFriend {
//	//필드
//	private String name;
//	private String department;
//	private String phone;
//	//생성자
//	public CompFriend(String na, String de, String ph) {
//		name = na;
//		department = de;
//		phone = ph;
//	}
//	//메소
//	public void showInfo () {
//		System.out.println("이름: " + name);
//		System.out.println("부서: " + department);
//		System.out.println("번호: " + phone);
//	}
//	
//}
//public static class MyFriends2 {	
//	public static void main(String[] args) {
////		대학친구 관리를 위한 배열과 변수 
//		UnivFriend[] ufrns = new UnivFriend[3];
//		int  ucnt = 0;	
////	   직장동료 관리를 위한 배열과 변수 
//		CompFriend[] cfrns = new CompFriend[3];
//		int  ccnt = 0;
//		
//		//대학친구 추가
//		ufrns[ucnt++] = new UnivFriend("Lee", "Computer", "010-1");
//		ufrns[ucnt++] = new UnivFriend("Kim", "Art", "010-2");
//		ufrns[ucnt++] = new UnivFriend("Seo", "Korean", "010-3");
//		// 대학친구 목록일괄 출력 	
//		for(int i=0; i < ufrns.length; i++) {
//			ufrns[i].showInfo();
//		//직장동료  추가
//		cfrns[cfrns++] = new Compfriend("An", "Arrow", "010-1")
//		cfrns[cfrns++] = new Compfriend("Choi", "Crossfit", "010-2");
//		cfrns[cfrns++] = new Compfriend("Moon", "Dance", "010-3");
////		//직장동료  목록일괄 출력 	
////		for(int i=0; i < ufrns.length; i++) {
////			ufrns[i].showInfo();
////		}
//////			
////	
////		
//	}
////녹음파일 12
//}
