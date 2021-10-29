package java_jsk;

abstract class Unit2 {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("����ϴ�.");

	}

}
	interface Fightable {
		void move(int x, int y); // public abstract�� ������
		void attack(Fightable f); // public abstract�� ������
	}

class Fighter extends Unit2 implements Fightable{
	public void move(int x, int y) { //�������̵� ��Ģ: ���󺸴� ���������ڰ� ������ �ȵȴ�.
		System.out.println("["+x+","+y+"]�� �̵�");
	}
	public void attack(Fightable f) {
		System.out.println(f+"�� ����");
	}
}

public class FighterTest {

	public static void main(String[] args) {
		 Fighter f = new Fighter();
		 f.move(100, 200);
		 f.attack(new Fighter());
	}

}
