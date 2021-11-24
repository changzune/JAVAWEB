package sec08;

public class Example {
	public static void main(String[] args) {
		
		Parent parent = new Child();
		
		parent.field = "data1";
		parent.method1();
		parent.method2();
		
		Child Child = (Child) parent;
		
		Child.field2 ="data2";
		Child.method3();
		
		
			
	
	}

}
