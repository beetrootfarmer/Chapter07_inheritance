package ch07_1_inheritance;

public class StudentExample {
	public static void main(String[] args) {
		Student student1 =new Student("홍길", "123456-1234567", 1);
		System.out.println("name: " + student1.getName());
		System.out.println("ssn: " + student1.getSsn());
		System.out.println("studentNo: " + student1.studentNo);
	}

}
