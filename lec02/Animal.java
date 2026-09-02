class Animal {
	static int count = 0;
	String name;

	Animal(String name) { 
		this.name = name; 
		count++; 
	}

	public String toString() { 
		return "Animal: " + name; 
	}
}

class Dog extends Animal {

	Dog(String name) { 
		super(name); 
	}

	public String toString() { 
		return "Dog: " + name; 
	}
}

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal("Rex");
		Dog d1 = new Dog("Buddy");
		Dog d2 = new Dog("Max");

		System.out.println(a);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(Animal.count);
	}
}
