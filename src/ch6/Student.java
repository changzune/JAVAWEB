package ch6;

public class Student{
	protected String name;  //�̸�
	protected int grade;   //�г�
	//private String name;  //private �� �����ϸ� ����� �ȵȴ�.
	//private int grade; 

  public Student() {
	  System.out.println("Student �θ� ������ ȣ��");
   }

  public String getName() {return name;}
  public int getGrade() {return grade;}

  //�л��� �Ż� ������ �ѹ���  ����� �ִ� �޼ҵ�
  public String getStudInfo() { 
   System.out.println("Student Ŭ������ getStudInfo() ȣ��");
   return "�̸�: " + name + ",�г�: " + grade;
  }
}

