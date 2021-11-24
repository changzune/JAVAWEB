package exam06;

public class Television implements RemoteControl {
	
	private int volume;
	

	@Override
	public void trunOn() {
		System.out.println("Æ¼ºñ¸¦ ÄÕ´Ï´Ù.");
		
	}

	@Override
	public void trunOff() {
		System.out.println("Æ¼ºñ¸¦ ²ü´Ï´Ù.");
		
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
		System.out.println("ÇöÀç TV º¼·ý:" + this.volume);
	}
}

