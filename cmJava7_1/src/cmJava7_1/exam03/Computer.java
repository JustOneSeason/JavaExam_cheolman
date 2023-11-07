package cmJava7_1.exam03;

public class Computer extends Calculator{
	//오버라이딩
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI * r * r;
	}
}
