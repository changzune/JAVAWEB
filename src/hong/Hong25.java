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
		  /* 클래스 변수를 활용하여 총 학생수를 출력하도록 하시오 */
		 static int count = 0;
		  String name;
		  Student(String name) { 
			  count++;
		    this.name = name;
		  }  
		}

