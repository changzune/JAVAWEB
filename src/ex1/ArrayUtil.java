package ex1;

public class ArrayUtil {
	   //�迭 ��Ұ����� ���հ� ����� ���ϴ� �޼���
	   public void calcArray(int[] num){
	      int total=0;  //������ �����ϴ� ����
	      float average=0f; //����� �����ϴ� ����

	      for(int i=0; i<num.length;i++){
	         total+=num[i];
	      }

	      average=(float)total/num.length;
	      System.out.println("�迭�� ����:"+total+",�迭�� ���:"+average);
	   }
	   //�迭Ŭ������ ������ �żҵ带 �߰��ؼ� ����ϸ� �ȴ�.
	   //�迭��Ұ��� ������������ �����ϴ� �޼���
	   public void sortArray(int[] num){
	      int temp=0;

	      for(int i=0; i<num.length;i++){
	         for(int j=i+1; j<num.length;j++){
	            if(num[i]>num[j]){
	               temp=num[i];
	               num[i]=num[j];
	               num[j]=temp;
	            }
	         }
	      } //end for

	      for(int i=0; i<num.length;i++){
	         System.out.print(num[i]+"\t");
	      }
	   }
	}


	
	
	
	


