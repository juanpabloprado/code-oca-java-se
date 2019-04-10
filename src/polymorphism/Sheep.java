package polymorphism;

public class Sheep implements Describable {
	
	private String description;
	
	public Sheep(String name) {
		this.description = "A sheep named " + name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	/*
	 * Implement other methods for a sheep
	 */
}
