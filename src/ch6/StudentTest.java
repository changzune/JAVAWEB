package ch6;
public class StudentTest{
	public static void main(String [ ] args){
		String sinsang=null;
		Elementary e=new Elementary("�̼���",2);
		University c = new University("ȫ�浿", 3, 20);
		
		sinsang=e.getStudInfo();
		System.out.println("�л� ����:" +sinsang);
		sinsang=c.getStudInfo();
		System.out.println("�л� ����:"+sinsang+ ", ��������: " + c.getCourses()+"��");
	}
}

