package ch4;

public class ArrayTest {
	public static void main(String[ ] args){
		int[] num ;
		String [] name ;

		//�迭����
		num = new int[3];
		name = new String[2];

		//�迭�ʱ�ȭ, �ʱ�ȭ ���������� 0�� �Ҵ�ȴ�.

		num[0]=1;
		num[1]=2;
		num[2]=3;
		//�迭��ҿ���  ���� Ÿ���� �����͸� ���尡���ϴ�.
		//num[2]="ȫ�浿";
		
		//���� �߻� ������ �迭 ��Һ��� ū ��ҿ� ���� �Ҵ��� �� ����.
		//num[3]=4;
		

		name[0] = "ȫ�浿";
		name[1]="�̼���";
		//name[2] = "������"; ���� �߻�

		System.out.println("num�迭�� ���� : " + num.length);

		for(int i=0; i<num.length; i++){
			System.out.println("num:" + num[i]);
		}

		System.out.println("name �迭�� ���� : " + name.length);
		for(int i=0; i<name.length;i++){
			System.out.println("name: " + name[i]);
		}




	}
}
