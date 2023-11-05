package Car;

public class Car {

	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
//정적 메소드 선언 시 주의할 점
}
