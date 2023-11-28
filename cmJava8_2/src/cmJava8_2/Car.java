package cmJava8_2;

public class Car {
	
	Tire frontLeftTire = new Hankook();
	Tire frontRightTire = new Hankook();
	Tire backLeftTire = new Hankook();
	Tire backRightTire = new Hankook();
	//인터페이스에서 설명된 roll 호출
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
