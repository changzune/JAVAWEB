package hong;

public class HeroTest {
	
	  public static void main(String[] args) {
		    // �� �ο�� ��ü ����
		    Hero arthas = new Hero("�Ƽ���");
		    Hero leona = new Hero("������");
		    
		    // ���� ����
		    Hero.battle(arthas, leona);
		  }
		}

		class Hero {
		  // �ʵ�
		  String name;
		  int hp;
		  
		  // ������
		  public Hero(String str) {
		    name = str;
		    hp = 30;
		  }
		  
		  // �޼ҵ�(�ν��Ͻ� �޼ҵ�)
		  public void punch(Hero enemy) {
		    /* 1. �ش� �޼ҵ带 �ϼ��ϼ���. */
		  }
		  
		  // �޼ҵ�(Ŭ���� �޼ҵ�)
		  public static void battle(Hero a, Hero b) {
		    /* 2. �ش� �޼ҵ带 �ϼ��Ͻÿ�. */
		  }
		}


