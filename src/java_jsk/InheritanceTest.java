package java_jsk;


class point extends Object {
	int x;
	int y;
}

//class Circle extends point{
//	int r;
//}

class Circle extends Object {
	point p = new point();
	int r;
	
}




public class InheritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		
		System.out.println(c.p.x);
		System.out.println(c.p.y);
		System.out.println(c.r);
		System.out.println(c.toString());
		

	}

}
