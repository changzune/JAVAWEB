package exam06;

public class Myclass {
	//field
	
	RemoteControl rc = new Television();
	

	//Constructor
	Myclass() {
		
	}
	
	Myclass(RemoteControl rc){
		this.rc = rc;
		rc.trunOn();
		rc.trunOff();
		
	}
	void methodA(RemoteControl rc) {
		RemoteControl rc1 = new Audio();
		rc.trunOn();
		rc.trunOff();
		
	}
	
	
	//method
	void methodB(RemoteControl rc) {
		rc.trunOn();
		rc.trunOff();
	}

}
