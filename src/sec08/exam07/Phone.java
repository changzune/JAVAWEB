package sec08.exam07;

public abstract class Phone {
	//필드
	public String owner;
	
	
	//생성장 외부로부터 오너의 정보를 받아서 필드의 저장;
	public Phone(String owner) {
		this.owner = owner;
		
	}
	
	//메소드
	public void turnOn1() {
		System.out.println("phone전원을 켭니다.");
	}
	
	public void turnoff2() {
		System.out.println("phone전원을 끕니다.");
	}
	
	
	

}
