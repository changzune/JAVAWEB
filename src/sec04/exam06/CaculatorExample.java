package sec04.exam06;

public class CaculatorExample {

	public static void main(String[] args) {
		
		Caculator myCalc = new Caculator();
		
		
		double result1 = myCalc.areaRectangle(10);
		double result2 = myCalc.areaRectangle(10, 20);
		
		System.out.println("���簢���� ���� " + result1);
		System.out.println("���簢���� ���� " + result2);
		

	}

}
