package ������;

public class Student{
	private String name;
	private int grade;
	
	public Student(String _name,int _grade){
		System.out.println("���ڰ� �ΰ��� ������ ȣ��");
		name=_name;
		grade=_grade;
	}
	
	public Student(String _name){
		System.out.println("���ڰ� �Ѱ��� ������ ȣ��");
		name=_name;
	}
	
	public Student(){
		System.out.println("����Ʈ ������ ȣ��");
	}	
	public String getName(){
		return name;
	}
	public int getGrade(){
		return grade;
	}
	
	public void setName(String _name){
		name=_name;
	}
	
	public void setGrade(int _grade){
		grade=_grade;
	}
}

