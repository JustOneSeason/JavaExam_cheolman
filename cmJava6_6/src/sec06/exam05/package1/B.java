package sec06.exam05.package1;

public class B {
	
	public B() {
		A a = new A();
		a.field1 =1;
		a.field2 =1;//같은 패키지안에 있어서 가능
		//a.field13 =3; private라 안됨
		
		a.method1();
		a.method2();
		//a.method3();
	}
}
