package test;

public class MethodEx6 {
	//1.���ϰ��� �ִ� �޼ҵ带 �����Ѵ�.
	public void  summarize(int a){
		int sum=0;
		for(int i=1; i<=a;i++)
			sum+=i;  //sum=sum+i
		
		print(a,sum);
	}
	
	public void print(int _a,int sum){
		System.out.println("1���� "+_a+"������ ���� " +sum);
	}
	
	public static void main(String[] args){
		//2.���� ����
		int num1=10;
		int num2=20;
		int result=0;
		
		//3.����� �޼ҵ尡 �ִ� Ŭ������ ��ü ����
		MethodEx6 m=new MethodEx6();
		
		m.summarize(num1);
		
		m.summarize(num2);
		
		m.summarize(100);
	}
}

