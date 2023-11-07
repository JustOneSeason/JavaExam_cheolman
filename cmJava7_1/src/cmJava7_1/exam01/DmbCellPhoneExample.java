package cmJava7_1.exam01;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "블루", 10);
		//부모
		System.out.println("모델: "+dmbCellPhone.model);
		System.out.println("색상: "+dmbCellPhone.color);
		//자식
		System.out.println("채널: "+dmbCellPhone.channel);
		//부모 클래스
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.sendVoice("안녕하세요");
		dmbCellPhone.receiveVoice("안녕하세요~ 저는 한철만입니다");
		dmbCellPhone.sendVoice("반가워요");
		dmbCellPhone.hanUp();
		//자식 클래스
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
