package hong;

public class Hong22_1 {
	
	//우리 동네 편의점에서는 겨울시즌만 되면 호빵을 판다. 호빵의 종류는 아래와 같다.
	//팥	 호빵: 600원
	//야채 호빵: 700원
	//피자 호빵: 900원
	
		  public static void main(String[] args) {
		    // 팥 호빵
		    HoBang h1 = new HoBang();
		    h1.contents = "팥";
		    h1.price = 600;
		    System.out.println(h1.info());
		    /* 1. 야채 호빵 객체 정보를 출력 하시오 */
		    HoBang h2 = new HoBang();
		    h1.contents = "야채";
		    h1.price = 700;
		    System.out.println(h2.info());
		    /* 2. 피자 호빵 객체 정보를 출력 하시오 */
		    HoBang h3 = new HoBang();
		    h1.contents = "피자";
		    h1.price = 900;
		    System.out.println(h3.info());
		  }
		}
		class HoBang {
		  // 필드
		  String contents;
		  int price;
		  // 메소드
		  String info() {
		    return String.format("%s 호빵: %d원", contents, price);
		  }
		}


