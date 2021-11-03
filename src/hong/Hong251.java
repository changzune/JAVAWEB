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
		  // 클래스 메소드
		  static void m1 () {
		    System.out.println("클래스 메소드 호출!");
		  }
		  // 일반 메소드
		  void m2 () {
		    System.out.println("일반 메소드 호출!");
		  }

}
