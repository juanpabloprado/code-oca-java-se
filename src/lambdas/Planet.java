package lambdas;

import javafx.scene.paint.Color;

public class Planet {
	private String name = "Unknown";
	private Color primaryColor = Color.WHITE;
	private int numberOfMoons;
	private boolean ringed;
	
	public Planet(String name, Color primaryColor, int numberOfMoons, boolean ringed) {
		this.name = name;
		this.primaryColor = primaryColor;
		this.numberOfMoons = numberOfMoons;
		this.ringed = ringed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getPrimaryColor() {
		return primaryColor;
	}

	public void setPrimaryColor(Color primaryColor) {
		this.primaryColor = primaryColor;
	}

	public int getNumberOfMoons() {
		return numberOfMoons;
	}

	public void setNumberOfMoons(int numberOfMoons) {
		this.numberOfMoons = numberOfMoons;
	}

	public boolean isRinged() {
		return ringed;
	}

	public void setRinged(boolean ringed) {
		this.ringed = ringed;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
