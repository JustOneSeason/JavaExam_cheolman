package exam04;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//자동 타입 변환 
		driver.drive(bus);
		driver.drive(taxi);
	}

}
