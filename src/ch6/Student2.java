package ch6;

public class Student2{
	protected String name;  //�̸�
	protected int grade;   //�г�
	//private String name;  //private �� �����ϸ� ����� �ȵȴ�.
	//private int grade; 

  public Student2() {System.out.println("Student �θ� ������ ȣ��");}

  public String getName() {return name;}
  public int getGrade() {return grade;}

  public void setName(String name){
	  this.name=name;
  }
  
  public void setGrade(int grade){
	  this.grade=grade;
  }
  public String getStudInfo() { 
   System.out.println("Student Ŭ������ getStudInfo ȣ��");
   return "�̸��� : " + name + "�г��� : " + grade;
  }
}

