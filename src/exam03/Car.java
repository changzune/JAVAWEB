package exam03;

public class Car {
	//Field
	
	String company ="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		
	}
	
	Car(String model){
		this.model = model;
		
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	//코드가 지저분한다 조금 더 간결화 해보자.
	//this옆에 두면된다.
	
	
}
