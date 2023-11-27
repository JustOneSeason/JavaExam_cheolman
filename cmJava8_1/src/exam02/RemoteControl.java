package exam02;
//interfoace 하기 인터페이스 만들기
public interface RemoteControl {
	//상수
	public int MAx_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
