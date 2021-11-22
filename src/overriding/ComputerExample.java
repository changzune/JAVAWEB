package overriding;

public class ComputerExample {

	public static void main(String[] args) {
	
		int r = 10;
		
		Calcultor Calcultor = new Calcultor();
		System.out.println("원면적 " + Calcultor.areaCircle(r));
		
		Computer computer = new Computer();
		System.out.println("원면적" + computer.areaCircle2(r));
		
		

	}

}
