package hong;

public class Hong22 {
//�Ʒ� ���� �ڵ带 ������ �м��ϰ�, �̸� �ּ����� �ۼ��Ͻÿ�. 
		  public static void main(String[] args) {
		    //��ü����
			Hero2 h1 = new Hero2();
		    //����� Ŭ�������� ������ �ʵ带 ���
			//��ü�����Ѱ��� �̿��Ͽ� ��ü���� �ʱ�ȭ;
		    h1.name = "�긮��";
		    h1.hp = 100;
		    h1.punch();
		  }
		}
		class Hero2 { //Ŭ���� ����
		  // �ʵ忡 �̸��� ������ �־��� ��ġ�� �����ϸ� �̸��� ��ġ�� �����Ե� 
			//���ο��� ����ȴ�.
		  String name;
		  int hp;
		  // �޼ҵ�
		  void punch() {
		    System.out.println(name + "�� ��ġ!");
		  }
		}