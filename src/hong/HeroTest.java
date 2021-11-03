package hong;

public class HeroTest {
	
	  public static void main(String[] args) {
		    // 두 싸움꾼 객체 생성
		    Hero arthas = new Hero("아서스");
		    Hero leona = new Hero("레오나");
		    
		    // 격투 시작
		    Hero.battle(arthas, leona);
		  }
		}

		class Hero {
		  // 필드
		  String name;
		  int hp;
		  
		  // 생성자
		  public Hero(String str) {
		    name = str;
		    hp = 30;
		  }
		  
		  // 메소드(인스턴스 메소드)
		  public void punch(Hero enemy) {
		    /* 1. 해당 메소드를 완성하세요. */
		  }
		  
		  // 메소드(클래스 메소드)
		  public static void battle(Hero a, Hero b) {
		    /* 2. 해당 메소드를 완성하시오. */
		  }
		}


