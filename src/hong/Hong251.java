package hong;

public class Hong251 {
	  public static void main(String[] args) {
		    Test.m1(); // O
		    
		    Test t = new Test();
		    t.m2(); // X
		    Test test = new Test();
		    test.m1(); // O
		    test.m2(); // O
		  }
		}
		class Test {
		  // Ŭ���� �޼ҵ�
		  static void m1 () {
		    System.out.println("Ŭ���� �޼ҵ� ȣ��!");
		  }
		  // �Ϲ� �޼ҵ�
		  void m2 () {
		    System.out.println("�Ϲ� �޼ҵ� ȣ��!");
		  }

}
