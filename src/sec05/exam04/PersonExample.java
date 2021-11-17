package sec05.exam04;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("12345-123456","홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation="usa";
		//p1.ssn = "6543212-12312;
		p1.name = "감자바";
		
	}
	

		

}
