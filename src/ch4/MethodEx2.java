package ch4;

public class MethodEx2 {
	// �����ִ�  �޼ҵ带 �����Ѵ�.
	public  void   print(int a){
		System.out.println("�����= "+a);
		
	}
	
	public static void main(String[] args){
		//2.���� ����
		int a=11;
		int b=22;
		int result=0;
		
		//3.����� �޼ҵ尡 �ִ� Ŭ������ ��ü ����
		MethodEx2 m=new MethodEx2();
		result=a+b;
		//4.�޼ҵ�ȣ��
		m.print(10);
		m.print(b);
		m.print(result);
	}		
}



