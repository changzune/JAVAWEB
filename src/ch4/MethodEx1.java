package ch4;

public class MethodEx1 {

	
	//1.���ϰ��� ���ھ��� �޼ҵ带 �����Ѵ�.
	public  void   print(){
		System.out.println("�޼ҵ带 ȣ���մϴ�.");
		//4.22
	}
	
	public static void main(String[] args){
		//2.���� ����
		int a=1;
		int b=2;
		int result=0;
		
		//3.����� �޼ҵ尡 �ִ� Ŭ������ ��ü ����
		MethodEx1 method=new MethodEx1();
		
		//4.�޼ҵ�ȣ��
		method.print();
		method.print();
		method.print();
		
	}	

}
