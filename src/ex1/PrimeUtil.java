package ex1;
public class PrimeUtil {
	public void calcPrime(int num){
		int count=0;
		int sum=0;
		for(int i=2; i<=num;i++){
			for(int k=1; k<=i;k++){
				if(i%k==0)
					count++;
			}
						
			if(count==2){
				sum+=i;
				//System.out.print(i+",");
			}
			
			count=0;
		}
		
		System.out.println(1+"���� "+num+"������ �Ҽ����� ���� "+sum);
	}

	public void calcPrime(int num1,int num2){
		int count=0;
		int sum=0;
		for(int i=num1; i<=num2;i++){
			for(int k=1; k<=i;k++){
				if(i%k==0)
					count++;
			}
						
			if(count==2){
				sum+=i;
				//System.out.print(i+",");
			}
			
			count=0;
		}
		
		System.out.println(num1+"���� "+num2+"������ �Ҽ����� ���� "+sum);	
	}
}
