package ch3;

public class TempTest {
	public static void main(String[] args) {
		int BASE=32;
		float celsius=0f,fahrenheit=0f;
		
		fahrenheit=100;
		//화씨 온도를 섭씨 온도로 변환한다.
		celsius=(fahrenheit-BASE)*5.0f/9.0f;
		
		System.out.println("화씨 "+fahrenheit+"도에 대한 섭씨는 "+celsius+"도입니다.");
		
		//섭씨 온도를 화씨 온도로 변환한다.
		fahrenheit=celsius*9.0f/5.0f +BASE;
		System.out.println("섭씨 "+celsius+"도에 대한 화씨는 "+fahrenheit+"도입니다.");
	}
}


