package pkg1;

public class MyParent{ // 접근제어자 변경
	private int prv; //같은 클래스
			int dft; //같은 패키지
	protected int prt; // 같은패키지 +자손 (다른패키지)
	public int pub; //접근 제한없음
	
	
	public void pintMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
		
	}
	
	
}

 class MyParentTest {
	
public static void main(String[] args) {
	MyParent p = new MyParent();
	//System.out.println(p.prv); //에러. 접근범위가 맞지 않는다. 클래스에서 가능 
	System.out.println(p.dft);
	System.out.println(p.prt);
	System.out.println(p.pub);
	
	
	
}
}
