package ch4;

public class ArrayTest8 {
	public static void main(String[] args) {
		int[] num ={34,56,78,99,23,46,21,46,76,55};
		int temp=0;
		
		System.out.println("���� �� �迭 ��");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+"\t");
		}
		
		for(int i=0; i<num.length;i++){
			for(int j=i;j<num.length;j++){
				if(num[i]>num[j]){
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
		System.out.println("\n���� �� �迭 ��");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+"\t");
		}

	}
}
