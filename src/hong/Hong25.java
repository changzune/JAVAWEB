package hong;

public class Hong25 {
		  public static void main(String[] args) {
		    Student a = new Student("Tom");
		    System.out.println(a.count);
		    Student b = new Student("John");
		    System.out.println(b.count);
		    Student c = new Student("Kate");
		    System.out.println(c.count);
		  }
		}
		class Student {
		  /* Ŭ���� ������ Ȱ���Ͽ� �� �л����� ����ϵ��� �Ͻÿ� */
		 static int count = 0;
		  String name;
		  Student(String name) { 
			  count++;
		    this.name = name;
		  }  
		}

