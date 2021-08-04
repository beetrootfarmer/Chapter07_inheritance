package ch07_1_inheritance;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //부모생성자 호출. this는 자기멤버 부를때, 부모생성자 부를때 쓸 수 없
		this.studentNo = studentNo; //생성자 호출 
	}

}
