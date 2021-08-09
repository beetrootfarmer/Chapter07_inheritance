package ch07_3_polymorphism_ex;

//import ch07_3_polymorphism_ex.Cake.CheeseCake;
//import ch07_3_polymorphism_ex.Cake.StrawberryCheeseCake;

class Cake {
		//메소드 
	public void sweet() {System.out.println("Cake.sweet()");}
	public void send()  {System.out.println("Cake Sending...");
}
class CheeseCake extends Cake { 
		//메소드 
	public void smooth() {System.out.println("CheeseCake.smooth");}
	@Override
	public void send() {
		System.out.println("CheeseCake Sending...");
	}
} 
 class StrawberryCheeseCake extends CheeseCake {
		//메소드 
	public void sour() {System.out.println("StrawberryCheeseCake.sour");}
	@Override
	public void send() {
		System.out.println("StrawberryCheeseCake Sending...");
	}
}
 
 public class CakeControlCode  {
		public void main(String[] args) {
			
			//StrawberryCheeseCake 인스턴스는 CheeseCake 인스턴스이면서 Cake인스턴스이다..
			Cake cake1 = new StrawberryCheeseCake();
			CheeseCake cake2 = new StrawberryCheeseCake();
		
			cake1.sweet();
			cake2.smooth();
			
			/**
			 * 참조변수 간 대입과 형변환 
			 */
			CheeseCake ca1 = new CheeseCake();
			Cake ca2 = ca1;
			ca2.sweet();
			ca2.send();
			
			Cake ca3 = new CheeseCake();
//			CheeseCake ca4 = ca3; 불가능!!
			ca3.sweet();
			
			CheeseCake ca4 = (CheeseCake)ca3; //강제 형 변환
			ca4.smooth();
			ca4.send();
		
			
			/**
			 * 일괄 처리 (배열 관점에서 정리)
			 */
			Cake[] cakes = new Cake[10]; // 치즈케이크의 인스턴스를 담을 수 있는 것을 10개 만들었
		
			cakes[0] = new Cake();
			cakes[1] = new CheeseCake();
			cakes[2] = new StrawberryCheeseCake();
			
			for(int i=0; i < cakes.length; i++) {
				cakes[i].send();
			}
		}
	}
}
