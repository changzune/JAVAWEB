package overriding;

public class Computer extends Calcultor{
	@override
	public double areaCircle2(double r) {
		System.out.println("ÄÄÇ»ÅÍ");
		return Math.PI*r*r;
	}
}
