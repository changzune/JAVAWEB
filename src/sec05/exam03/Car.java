package sec05.exam03;

public class Car {
	
	int speed;
	
	void run() {
		System.out.println(speed);
	}
	
	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.speed= 60;
		mycar.run();
		
	}

}
