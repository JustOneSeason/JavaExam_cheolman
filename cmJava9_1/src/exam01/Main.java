package exam01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		
		//인스턴스 멤버 클래스
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//로컬 클래스
		a.method();
	}

}
