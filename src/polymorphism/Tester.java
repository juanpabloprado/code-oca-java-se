package polymorphism;

public class Tester {

	public static void main(String[] args) {
		new Tester();
	}
	
	public Tester() {
		Goat goat = new Goat("Bob");
		GoatShelter goatShelter = new GoatShelter(4, 4, 6);
		Sheep sheep = new Sheep("John");
		System.out.println(description(goat));
		System.out.println(description(goatShelter));
		System.out.println(description(sheep));
	}
	
	private String description(Describable d) {
		return d.getDescription();
	}
}
