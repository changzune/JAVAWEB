package ex1;

public class ArrayUtil {
	   //배열 요소값들의 총합과 평균을 구하는 메서드
	   public void calcArray(int[] num){
	      int total=0;  //총합을 저장하는 변수
	      float average=0f; //평균을 저장하는 변수

	      for(int i=0; i<num.length;i++){
	         total+=num[i];
	      }

	      average=(float)total/num.length;
	      System.out.println("배열의 총합:"+total+",배열의 평균:"+average);
	   }
	   //배열클래스를 가지고 매소드를 추가해서 사용하면 된다.
	   //배열요소값을 오름차순으로 정렬하는 메서드
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


	
	
	
	


