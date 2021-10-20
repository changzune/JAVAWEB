package test; //메소드 예제
class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		mm.printGugudan(6); // 구구단 3단 출력

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
 }

 class MyMath {
	 void printGugudan(int dan) {
		 
		 if(!(2<=dan && dan <=9))
			 return;
		 for(int i=1 ; i<=9; i++) {
			 System.out.printf("%d * %d = %d%n", dan, i, dan*i);
		 }
		  //return;
		 
	 }
	 
	 
	long add(long a, long b) {
		long result = a + b;
		return result;
	//	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	long max(long a, long b) {
		long result = 0;
		if(a>b) {
			result = a;
		} else {
			result = b;
		}
		return result;	
		
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
 }
