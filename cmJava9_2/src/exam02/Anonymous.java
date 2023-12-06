package exam02;

public class Anonymous {
	
	RemoteContol field = new RemoteContol() {
		//오버라이딩
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	void method1() {
		//로컬 변수값으로 대입
		RemoteContol localVar = new RemoteContol() {
			//오버라이딩
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		
		//로컬 변수 사용
		localVar.turnOn();
	}
	
	void method2(RemoteContol rc) {
		rc.turnOn();
	}
}
