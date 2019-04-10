package polymorphism;

public class Goat implements Describable {
	
	private String description;
	
	public Goat(String name) {
		this.description = "A goat named " + name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	/*
	 * Implement other methods for a goat
	 */
}
