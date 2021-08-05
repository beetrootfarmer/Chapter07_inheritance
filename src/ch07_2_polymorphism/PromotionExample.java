package ch07_2_polymorphism;

class Animal{}

class Bird extends Animal{}
class Cat extends Animal{}
class Dog extends Bird{}
class Elephant extends Cat{}

class Myclass extends Object{}

public class PromotionExample {
	public static void main(String[] args) {
		Bird b = new Bird(); // int b = new int b(); 와 같은것. 형이 같다고 표현한 것
		Cat c = new Cat();
		Dog d = new Dog();
		Elephant e = new Elephant();
		
		Animal a1 = b;
		Animal a2 = c;
		Animal a3 = d;
		Animal a4 = e;
		
		Bird b1 = d;
		Cat c1 = e;
		
		Myclass mc = new Myclass();
		
//		Bird b3 = e;
//		Cat c2 = d;
// 		obj형으로 받으면 모든 객체를 다 받아쓸 수 있다?! 
	}

}
