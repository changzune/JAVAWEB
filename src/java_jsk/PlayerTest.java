package java_jsk;

abstract class Player { //�߻�Ŭ���� �̿�����Ŭ���� �̿ϼ����赵 
	abstract void play(int pos); // �߻�ż���
	abstract void stop();
	
}


class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos+"��ġ���� play �մϴ�.");}
	void stop() {System.out.println("����� ����ϴ�.");}
	
}



public class PlayerTest {

	public static void main(String[] args) {
		//Player p = new Player(); �߻�Ŭ������ ����� �޾Ƽ� ������ �Ѵ�.
		Player ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
		
	}

}
