package ch4;

public class MethodEx4 {
	//1.���ϰ��� �ִ� �޼ҵ带 �����Ѵ�.
	public int  add(int a, int b){
		int c=a+b;
		return c;
		//return 3.5; ���� �߻�
	}
	
	public static void main(String[] args){
		//2.���� ����
		int num1=10;
		int num2=20;
		int result=0;
		
		//3.����� �޼ҵ尡 �ִ� Ŭ������ ��ü ����
		MethodEx4 m=new MethodEx4();
		
		//�޼ҵ带 ȣ���� �� ���ϰ��� result�� ����ȴ�.
		result = m.add(num1,num2);
		
		//5.������
		System.out.println("�� ���� ���� " +result);
		System.out.println("�� ���� ���� " +m.add(100, 300));
	}	
}

