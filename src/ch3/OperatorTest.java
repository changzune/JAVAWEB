package ch3;
/*
   �ҽ� ����:
   1.�������� �����ڸ� �ȴ�.
   2.������ �켱 ������ �ȴ�.

*/

public class OperatorTest{

	public static void main(String[] args){
		int x=10;
		int y=2;
		int z=4;
		int result = x-y*z;

		System.out.println("result=x-y*z   : " + result);  //�������� �����Ѵ�.
		System.out.println("(1+4)*2) : "+(1+4)*2);         //��ȣ�ȿ� �ִ� �����ں��� �����Ѵ�.
		System.out.println("result%10 :" +result%10);      //10���� ���� �� �� �������� ����Ѵ�.

		String s="Hello";
		int su =10;		
		System.out.println("s instanceof String :" + (s instanceof String)); //s�� ���ڿ� Ÿ������ �˻��Ѵ�.

		boolean b =true;
		byte i =104;
		System.out.println("!b :" +!b);  //not ������ �����Ѵ�.
		System.out.println("i :"+ i);  
		System.out.println("Integer.toBinaryString(i) :"+Integer.toBinaryString(i));  //104�� �������� ����Ѵ�.

		int num =10;

		/* 
		 System.out.println(num);
		 num =num+1;
		*/	

		System.out.println("num++ :"+ (num++));  //num ���� ����� 1������Ų��.
		System.out.println("++num :"+ (++num));  //num ���� 1���� ��Ų�� ����Ѵ�.

		int num1 =10;
		num1++;    //num1�� 1������Ų��.
		System.out.println("num1 :"+ num1);

	}
}//end class