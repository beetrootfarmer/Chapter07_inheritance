package ch07_2_polymorphism;

public class 메이플용사 {
	void 공격() {}
	void 이동() {}

}

class 전사 extends 메이플용사{
	@Override
	void 공격() {
		sword();
	}
	@Override
	void 이동() {
		run();
	}
	void sword() {}
	void run() {}
	
}

class 법사 extends 메이플용사{
	@Override
	void 공격() {
		주문();
	}
	@Override
	void 이동() {
		텔레포트();
	}
	void 주문() {}
	void 텔레포트() {}
}

class 도적 extends 메이플용사{
	@Override
	void 공격() {
		super.공격();
	}
	@Override
	void 이동() {
		super.이동();
	}
	
}
