package exam05;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parrnt parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 parent.field2 = "data";//자식에게만 선언됨
		 parent.method3();//자식에게만 선언됨
		 */
		Child child = (Child)parent;
		child.field2 ="yyy";
		child.method3();
		
	}

}
