package ex1;

public class ArrayTest {
	public static void main(String[] args) {
	      //�������� ����
	      int[] score1={23,45,67,87,88,99,13,77,65};
	      int[] score2={56,78,98,88,77,55,43,21,99,67};

	      //�ν��Ͻ� ����
	      ArrayUtil u=new ArrayUtil();

	      //�޼��� ȣ���ϱ�
	      u.calcArray(score1);
	      u.sortArray(score1);

	      System.out.println();
	      u.calcArray(score2);
	      u.sortArray(score2);
	   }

}
