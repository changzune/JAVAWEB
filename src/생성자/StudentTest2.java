package ������;

public class StudentTest2 {
	
	public static void main(String[] args){
		Student s= new Student("ȫ�浿"); 
		Student s2= new Student("�̼���",23); 

		String name=s.getName();
		int grade=s.getGrade();
		System.out.println("ù��° �л��� �̸��� " + name+" ,�г�� "+grade);
		
		name=s2.getName();
		grade=s2.getGrade();
		System.out.println("�ι��� �л��� �̸��� "+name+" ,�г�� "+grade);
	}
}
