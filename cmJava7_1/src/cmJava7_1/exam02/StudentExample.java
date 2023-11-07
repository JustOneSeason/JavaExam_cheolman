package cmJava7_1.exam02;

public class StudentExample {
	public static void main(String[] args) {
		
		Student student = new Student("홍길동","12345-21423",1);
		//부모에게 상속받은 것
		System.out.println("name: "+student.name);
		System.out.println("ssn: "+student.ssn);
		//자식꺼
		System.out.println("studentNo: "+student.studentNo);
	}
}
