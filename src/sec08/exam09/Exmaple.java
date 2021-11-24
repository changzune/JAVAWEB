package sec08.exam09;

public class Exmaple {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		Animal animal = null;
		
		animal = new Dog();
		animal.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
		
		
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
		
	}


}
