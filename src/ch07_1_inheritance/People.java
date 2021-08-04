package ch07_1_inheritance;

public class People {
	
	//필
//	public String name;
//	public String ssn;
	private String name;
	private String ssn;
	
	//생성자 
	//메소드 /Generate Getter Setter 처리 
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSsn() {
		return ssn = "******-******"; //출력할때 이렇게 나옴...
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

}
