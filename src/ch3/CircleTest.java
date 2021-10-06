package ch3;


public class CircleTest {
	public static void main(String[] args) {
		int radius;
		float circum,area;
		float PI=3.141592f;  //�������� �����ϴ� ����
		radius=5;
		circum=2*PI*radius;
		area=PI*radius*radius;
		System.out.println("�������� "+radius+"�� ���� �ѷ�:"+circum+
				           ",����: "+area+"�Դϴ�.");
		
		radius=10;
		circum=2*PI*radius;
		area=PI*radius*radius;
		System.out.println("�������� "+radius+"�� ���� �ѷ�:"+circum+
				            ",����: "+area+"�Դϴ�.");
	}
}

