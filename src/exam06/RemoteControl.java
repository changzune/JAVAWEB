package exam06;

public interface RemoteControl {
	//상수
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//메소드
	void trunOn();
	void trunOff();
	void setVolume(int volume);

}
