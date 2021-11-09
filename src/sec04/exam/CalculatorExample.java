package sec04.exam;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculater myCalc = new Calculater();
		myCalc.poworOn();
		int result1 = myCalc.plus(5, 6);
		System.out.println(result1);
		
		byte x = 10;
		byte y = 4;
		myCalc.divide(x, y);
		
		
		double result2 = myCalc.divide(9, 4);
		System.out.println(result2);
		
		myCalc.powerOff();
		

	}
	
	
	

}
