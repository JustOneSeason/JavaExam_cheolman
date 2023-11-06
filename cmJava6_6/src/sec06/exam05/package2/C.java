package sec06.exam05.package2;

import sec06.exam05.package1.A;

public class C {

	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1; 같은 패키지가 아니라 안됨
		//a.field3 = 1; private라서 안됨
		
		a.method1();
		//a.method2();
		//a.method3();
	}
}
