package java_jsk;

class Mypoint {

	int x;
	int y;

	String getLocation() {
		return "x:" + x + ", y:" + y;
	}
}

class Mypoint3D extends Mypoint {
	int z;

	// 조상의 getLocation()을 오버라이딩
	String getLocation() {
		return "x:" + x + ", y:" + y + ", z:" + z;

	}
}

public class OverrideTest {
	public static void main(String[] args) {
		Mypoint3D p = new Mypoint3D();
		p.x = 3;
		p.y = 4;
		p.z = 7;
		System.out.println(p.getLocation());
	
	}
}
