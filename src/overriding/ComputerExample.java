package overriding;

public class ComputerExample {

	public static void main(String[] args) {
	
		int r = 10;
		
		Calcultor Calcultor = new Calcultor();
		System.out.println("������ " + Calcultor.areaCircle(r));
		
		Computer computer = new Computer();
		System.out.println("������" + computer.areaCircle2(r));
		
		

	}

}
