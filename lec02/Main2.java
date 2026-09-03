public class Main2 {
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
