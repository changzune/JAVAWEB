package sec08.exam06;

public class imstanceofExample {

	public static void main(String[] args) {
		
		Parent parentA = new Child();
		method1(parentA);
		

		}
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method1 - child로 변환성공");
						
		}else {
			System.out.println("method2 - child로 변환되지않음");
		}
		
	}
	
	
		
	}

