package exam02;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anonymous anony = new Anonymous();
		//익명 객체 필드 사용
		anony.field.turnOn();
		//익명 객체 로컬 변수 사용
		anony.method1();
		//익명 객체 매개값 사용
		anony.method2(
				new RemoteContol() {
					//오바라이딩
					public void turnOn() {
						System.out.println("SmartTV를 켭니다.");
					}
					public void turnOff() {
						System.out.println("SmartTV를 끕니다");
					}
				}
				);
	}

}
