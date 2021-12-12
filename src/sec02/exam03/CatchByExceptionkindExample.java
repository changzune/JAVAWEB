package sec02.exam03;

public class CatchByExceptionkindExample {

	public static void main(String[] args) {
		
		
		String data1 =null;
		String data2 =null;
		
		try {
			data1 = args[0];
			data2 = args[1];
	
	
			int value1 = Integer.parseInt(data1);
			int valus2 = Integer.parseInt(data2);
			int result = value1 + valus2;
			System.out.println(data1 + data2 + result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행매가값을 ");
			
		}catch(NumberFormatException e) {
			
			
		}finally {
			
		}
	
}
}
