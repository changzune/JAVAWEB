package ex1;

public class Student {
	//�ɹ����� ����
	private String name;
	private int grade;

	public Student(String _name){
		System.out.println("�Ű������� �� ���� ������ ȣ��");
		name=_name;
	}
	//����Ʈ ������ ����
	public Student(){
		System.out.println("����Ʈ ������ ȣ��");
	}
	
	//��� �޼ҵ� ����
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


	


