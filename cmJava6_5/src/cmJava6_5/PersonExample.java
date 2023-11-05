package cmJava6_5;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("123456-1234567","홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation ="usa";
		//p1.ssn ="1324-4543"; final을 사용하여 수정할수없다
		p1.name= "홍삼원";
	}

}
