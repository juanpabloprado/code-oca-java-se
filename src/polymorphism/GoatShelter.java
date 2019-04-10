package polymorphism;

public class GoatShelter implements Describable {
	
	private String description;
	private int height;
	private int width;
	private int length;

	public GoatShelter(int height, int width, int length) {
		this.height = height;
		this.width = width;
		this.length = length;
		this.description = "A goat shelter that is " + height + " high, " + length + " long and " + width + " wide ";
	}

	@Override
	public String getDescription() {
		return description;
	}

	/*
	 * Implement other methods for a goat shelter
	 */
}
