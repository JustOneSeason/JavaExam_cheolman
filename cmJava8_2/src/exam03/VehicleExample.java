package exam03;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.ckeckFare(); 인터페이스에는 없다
		
		Bus bus = (Bus) vehicle; //강제 타입 변환
		
		bus.run();
		bus.checkFare();
	}

}
