package chap07.sec02.exma02;

public class ChileExmaple {
	public static void main(String[] args) {
		Child child = new Child();
		child.method3();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
//		parent.method3();

	}
	
	

}
