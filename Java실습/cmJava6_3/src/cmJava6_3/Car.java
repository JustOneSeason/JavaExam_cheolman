package cmJava6_3;

public class Car {
	
	String company ="현대 자동차";
	String model;
	String color;
	int  maxSpeed;
	
	//this()로
	Car(){
		
	}
	
	Car(String model){
		this(model,"은색", 250);
	}
	
	Car(String model,String color){
		this(model,"color", 233);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
// 오버로딩	
//	Car(){
//		
//	}
//	
//	Car(String model){
//		this.model = model;
//	}
//	
//	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//	}
//	
//	Car(String model, String color, int maxSpeed){
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}오버로딩 생성자를 여러개 선언 생성자의 클래스와 타입 매개변수를 보고 판단 주의사항 매개변수의 순서는 똑같아야한다
	 //this 객체 자신의 참조
//	Car(String color, int cc){
//		
//	}
}
