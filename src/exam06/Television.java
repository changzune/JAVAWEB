package exam06;

public class Television implements RemoteControl {
	
	private int volume;
	

	@Override
	public void trunOn() {
		System.out.println("Ƽ�� �մϴ�.");
		
	}

	@Override
	public void trunOff() {
		System.out.println("Ƽ�� ���ϴ�.");
		
	}

	@Override
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			
		this.volume = volume;
	}
		System.out.println("���� TV ����:" + this.volume);
	}
}

