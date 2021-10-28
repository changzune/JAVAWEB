package java_jsk;

abstract class Player { //추상클래스 미오나성클래스 미완성설계도 
	abstract void play(int pos); // 추상매세드
	abstract void stop();
	
}


class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos+"위치부터 play 합니다.");}
	void stop() {System.out.println("재생을 멈춥니다.");}
	
}



public class PlayerTest {

	public static void main(String[] args) {
		//Player p = new Player(); 추상클래스는 상속을 받아서 만들어야 한다.
		Player ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
		
	}

}
