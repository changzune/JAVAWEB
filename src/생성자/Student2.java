package ������;

public class Student2 {
	private String name;
	private int age;
	private String address;

	//����� ���� ������ ����
	public Student2(String n,int a){
		System.out.println("�Ű������� �ΰ��� ������ ȣ��");
		name=n;
		age=a;
	}
	
	public Student2(String n){
		System.out.println("�Ű������� �� ���� ������ ȣ��");
		name=n;
	}
	//����ڰ� �����ڸ� ��������� ������ �ָ� 
	// ����Ʈ �����ڴ� ������ �� �ڵ����� �߰����� �ʴ´�.
	
	//����Ʈ ������ ����
	public Student2(){
		System.out.println("����Ʈ ������ ȣ��");
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setName(String n){
		name=n;
	}
	
	public void setAge(int a){
		age= a;
	}

}
