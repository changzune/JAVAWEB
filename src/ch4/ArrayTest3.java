package ch4;

public class ArrayTest3{
	public  static  void main(String[]  args){
		int arr[][];
		arr=new int[3][3];

		//i�� ������ �迭 arr�� ������ �迭���
		for(int i=0; i < arr.length;i++){  //i= 0,1,2
			//j�� arr�� ������ �迭���
			for(int j=0; j<arr[i].length;j++)  
				arr[i][j]=3*i +j;  //�迭�ε����� ���� ���� �迭�� �Ҵ��Ѵ�.
		}
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++)
				System.out.println("arr[" + i +"]["+ j + "]=" + arr[i][j]);
		}
	}
}