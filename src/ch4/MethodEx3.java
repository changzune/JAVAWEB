package ch4;

public class MethodEx3 {
	// ���ڰ� 2�� �ִ�  �޼ҵ带 �����Ѵ�.
	public  void   print(int a,int b){
		int c= a+b;
		System.out.println("�����= "+ c);
		
	}
	
	//���ڷ� ���ڿ��� �޴� �޼ҵ带 �����Ѵ�.
	public void print1(String str){
		System.out.println(str);
	}
	
	public static void main(String[] args){
		//2.���� ����
		int num1=11;
		int num2=22;
		int result=0;
		
		//3.����� �޼ҵ尡 �ִ� Ŭ������ �ν��Ͻ� ����
		MethodEx3 method=new MethodEx3();
		
		//4.�޼ҵ�ȣ��
		method.print(10,30);
		//method.print(10,30.5f);
		method.print(num1,num2);
		
		method.print1("�ȳ��ϼ���");
	}		
}



