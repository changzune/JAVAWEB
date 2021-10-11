package ex1;

public class Car {
	 int velocity;
	 int wheelNum;
	 String carName;
	 String owner;  //��������
	
	 public Car(){
		 System.out.println("Car ��ü ������ ȣ��");
	 }
	//getters//setters
	public int getVelocity(){
		return velocity;
	}
	
	public void setVelocity(int v){
		velocity=v;
	}
	
	public String getCarName(){
		return carName;
	}
	
	public void setCarName(String c){
		carName=c;
	}
	
	public String getOwner(){
		return owner;
	}
	
	public void setOwner(String o){
		owner=o;
	}
	
	//���� �������� �̸��� ���ϴ� �޼ҵ�
	public void getOwnerInfo(Car car){
		if(car instanceof Sedan){
			//Sedan sedan=(Sedan)car;  //downcasting
			//System.out.println("�� ������ �̸��� " + sedan.getOwner());
			System.out.println("�� ������ �̸��� " + car.getOwner());
		}else if(car instanceof Bus){
			Bus bus=(Bus)car;  //downcasting
			System.out.println("���� �Ҽ�ȸ��� " + bus.getCompany());
		}else if(car instanceof Truck){
			Truck truck=(Truck)car;  //downcasting
			System.out.println("Ʈ�� �Ҽ�ȸ��� " + truck.getCompany());
		}
		
	}
	
	
	//���� ����� �ϴ� �޼ҵ�
	public void speedUp(int speed){
		velocity=velocity+speed;
	}
	
	public void speedDown(int speed){
		velocity=velocity-speed;
	}
	
	public void stop(){
		velocity=0;
	}
	
	public String getCarInfo(){
		return carName+"�� �ӵ��� "+velocity;
	}

}
