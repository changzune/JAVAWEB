package hong;

public class Hong22_1 {
	
	//�츮 ���� ������������ �ܿ���� �Ǹ� ȣ���� �Ǵ�. ȣ���� ������ �Ʒ��� ����.
	//��	 ȣ��: 600��
	//��ä ȣ��: 700��
	//���� ȣ��: 900��
	
		  public static void main(String[] args) {
		    // �� ȣ��
		    HoBang h1 = new HoBang();
		    h1.contents = "��";
		    h1.price = 600;
		    System.out.println(h1.info());
		    /* 1. ��ä ȣ�� ��ü ������ ��� �Ͻÿ� */
		    HoBang h2 = new HoBang();
		    h1.contents = "��ä";
		    h1.price = 700;
		    System.out.println(h2.info());
		    /* 2. ���� ȣ�� ��ü ������ ��� �Ͻÿ� */
		    HoBang h3 = new HoBang();
		    h1.contents = "����";
		    h1.price = 900;
		    System.out.println(h3.info());
		  }
		}
		class HoBang {
		  // �ʵ�
		  String contents;
		  int price;
		  // �޼ҵ�
		  String info() {
		    return String.format("%s ȣ��: %d��", contents, price);
		  }
		}


