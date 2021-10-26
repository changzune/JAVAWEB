package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent{
	public void pintMembers() {
		//System.out.println(prv); //에러
		//System.out.println(dft); //에러
		System.out.println(prt);
		System.out.println(pub);
		
	}
	
}


public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
		//System.out.println(p.prv); //에러. 접근범위가 맞지 않는다. 클래스에서 가능 
		//System.out.println(p.dft);
		//System.out.println(p.prt);
		System.out.println(p.pub);
		
		
	}

}
