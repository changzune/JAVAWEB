package ch4;

public class MethodEx5 {
	//1.���ϰ��� �ִ� �޼ҵ带 �����Ѵ�.
	public int  summarize(int a){
		int sum=0;
		for(int i=1; i<=a;i++)
			sum+=i;  //sum=sum+i
		
		return sum;  //�޼ҵ带 ȣ���� ��ġ�� sum�� ���� �����Ѵ�.		
	}
	
	public static void main(String[] args){
		//2.���� ����
		int num1=10;
		int num2=20;
		int result=0;
		
		//3.����� �޼ҵ尡 �ִ� Ŭ������ ��ü ����
		MethodEx5 m=new MethodEx5();
		
		result = m.summarize(num1);
		System.out.println("1���� 10������ ���� " +result);
		
		result = m.summarize(num2);
		System.out.println("1���� 20������ ���� " +result);
		
		System.out.println("1���� 100������ ���� " +m.summarize(100));
	}
}

