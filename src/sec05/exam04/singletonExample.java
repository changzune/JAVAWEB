package sec05.exam04;

public class singletonExample {

	public static void main(String[] args) {
	/*	singleton obj1= new singleton();
		singleton obj2= new singleton();
	}
	*/

		singleton obj1= singleton.getInstance();
		singleton obj2= singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
		 
	}
}
