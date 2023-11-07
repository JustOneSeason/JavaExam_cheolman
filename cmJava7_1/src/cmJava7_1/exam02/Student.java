package cmJava7_1.exam02;

public class Student extends People{
	
	public int studentNo;
	
	public Student(String name, String ssn, int studenNo) {
		super(name,ssn);// 부모 생성자 호출
		this.studentNo = studentNo;
	}

}
