package hong;

public class Hong23 {
		  public static void main(String[] args) {
		    // ��ü ���� �� �ʱ�ȭ
		    Bicycle b1 = new Bicycle("�θ�2", 21.74, 899000);
		    
		    // ��ü ���� ���
		    System.out.printf("Bicycle { %s, %.2fkg, %d�� }\n", b1.name, b1.weight, b1.price);
		  }
		}

		class Bicycle {
		  // �ʵ�
		  String name;
		  double weight;
		  int price;
		  
		  // ������ - �Ķ���͸� ���� �ʱ�ȭ
		  Bicycle(String n, double w, int p) {
		    name = n;
		    weight = w;
		    price = p;
		  }
		}

	
	