package overriding;

public class Computer extends Calcultor{
	@override
	public double areaCircle2(double r) {
		System.out.println("��ǻ��");
		return Math.PI*r*r;
	}
}
