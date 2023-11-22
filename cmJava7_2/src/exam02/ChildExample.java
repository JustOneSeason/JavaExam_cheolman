package exam02;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();//오버라이딩됨
		child.method3();//prrent.method3()은 호출불가능
	}

}
