package exam02;

public class Cat extends Animal {
	
	public Cat() {
		this.kind = "포유류";
	}
	
	//오버라이딩
	public void sound() {
		System.out.println("애옹");
	}
	
}
