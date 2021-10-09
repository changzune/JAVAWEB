package ex1;

public class ArrayUtil {
	
	public void calcArray(int[] num) {
		
		int total = 0;
		float average = 0f;
		
		for(int i=0; i<num.length; i++) {
			total+=num[i];
			
		}
		
		average=(float)total/num.length;
		
		System.out.println("¹è¿­ÀÉ ÃÑÇÕ " + total + ",¹è¿­ÀÇ Æò±Õ" + average);
	
		
		
	}
	
	
	
	
	

}
