package ch07_4_abstract_class;

abstract class Animal {
	public String kind;
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	// 추상 메소드 ( 상속받는 자식클래스에서의 오버라이딩을 강제화) 
	public abstract void sound(); // 실체가 없는, 몸체가 없는 ___?? 상속받는 곳에서 사용하도록 공백. 자식클레스에서 사용하지 않으면 오류가난다 
}

class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("멍멍"); // 추상 메소드 재정의 
	}	
}

class Cat extends Animal{
	public Cat() {
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("야옹"); // 추상 메소드 재정의 
	}	
}

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		// 변수의 자동 타입 변환 
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
		
		// 메소드의 다형성
		animalSound(new Dog()); //animalSound로 자동 형변환 
		animalSound(new Cat());
		}
	
		public static void animalSound(Animal animal) { // 자동 타입 변환
			animal.sound(); // 재정의된 메소드 호출 	
	}
}
