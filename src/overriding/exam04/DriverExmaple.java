package overriding.exam04;

public class DriverExmaple {

	public static void main(String[] args) {
	
		Driver driver = new Driver();
	
		Vehicle veicle = new Vehicle();
		
		driver.drive(veicle);
		
		Bus bus = new Bus();
		driver.drive(bus);
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
	
		
		

	}

}
