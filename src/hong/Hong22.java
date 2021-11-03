package hong;

public class Hong22 {
//아래 뼈대 코드를 동작의 분석하고, 이를 주석으로 작성하시오. 
		  public static void main(String[] args) {
		    //객체생성
			Hero2 h1 = new Hero2();
		    //히어로 클래스에서 정의한 필드를 사용
			//객체생성한것을 이용하여 객체값을 초기화;
		    h1.name = "쥬리오";
		    h1.hp = 100;
		    h1.punch();
		  }
		}
		class Hero2 { //클래스 정의
		  // 필드에 이름과 생명을 넣어줌 펀치를 실행하면 이름과 펀치가 나가게됨 
			//메인에서 실행된다.
		  String name;
		  int hp;
		  // 메소드
		  void punch() {
		    System.out.println(name + "의 펀치!");
		  }
		}