package exam02;

public class Dog extends Animal {
	
	public Dog() {
		this.kind = "포유류";
	}
	
	//오버라이딩
	public void sound() {
		System.out.println("멍멍");//추상 메소드 재정의
	}
}
