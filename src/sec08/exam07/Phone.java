package sec08.exam07;

public abstract class Phone {
	//�ʵ�
	public String owner;
	
	
	//������ �ܺηκ��� ������ ������ �޾Ƽ� �ʵ��� ����;
	public Phone(String owner) {
		this.owner = owner;
		
	}
	
	//�޼ҵ�
	public void turnOn1() {
		System.out.println("phone������ �մϴ�.");
	}
	
	public void turnoff2() {
		System.out.println("phone������ ���ϴ�.");
	}
	
	
	

}
