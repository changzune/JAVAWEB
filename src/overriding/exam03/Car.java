package overriding.exam03;

public class Car {
	//�ʵ�
	public int speed;
	
	//������
	
	//�޼ҵ�
	public void speedup() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
	
	

}
