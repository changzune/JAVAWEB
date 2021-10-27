package java_jsk;

class Time {
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(iscValidHour(hour)) return;
		this.hour = hour; 
	}
	//�Ű������� �Ѱ��� hour�� ��ȿ���� Ȯ���ؼ� �˷��ִ� �޼���
	private boolean iscValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
	public int getHour() { return hour;};
		
	}
	



public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
	//	t.hour = 25;
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());

	}

}
