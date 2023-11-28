package cmJava8_2;

public class CarExample {
	public static void main(String[] arge) {
		
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new Kumho();
		myCar.frontRightTire = new Kumho();
		
		myCar.run();
	}
}
