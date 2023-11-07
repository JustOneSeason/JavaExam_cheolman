package cmJava7_1.exam03;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		//오바라이딩 되기전
		Calculator calculator = new Calculator();
		System.out.println("원면적 : "+calculator.areaCircle(r));
		System.out.println();
		//오버라이딩 후
		Computer computer = new Computer();
		System.out.println("원면적 : "+computer.areaCircle(r));

	}

}
