package sec01.exam05;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
			
		
		RemoteControl rc = tv;
		rc.trunOn();
		rc.setVolum(5);
		rc.turnOff();
		Searchable searchable = tv;
		searchable.serch("http://www.naver.com")
	}
}
