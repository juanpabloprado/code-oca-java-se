package lambdas;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.paint.Color;
import static lambdas.PlanetPredicates.*;

public class PlanetApp {
	public static void main(String[] args) {
		Planet mercury = new Planet("Mercury", Color.GRAY, 0, false);
		Planet venus = new Planet("Venus", Color.YELLOW, 0, false);
		Planet earth = new Planet("Earth", Color.BLUE, 1, false);
		Planet mars = new Planet("Mars", Color.RED, 2, false);
		Planet jupiter = new Planet("Jupiter", Color.YELLOW, 67, true);
		Planet saturn = new Planet("Saturn", Color.ORANGE, 62, true);
		Planet uranus = new Planet("Uranus", Color.TEAL, 27, true);
		Planet neptune = new Planet("Neptune", Color.BLUE, 14, true);
		List<Planet> planetList = new ArrayList<>();
		planetList.add(mercury);
		planetList.add(venus);
		planetList.add(earth);
		planetList.add(mars);
		planetList.add(jupiter);
		planetList.add(saturn);
		planetList.add(uranus);
		planetList.add(neptune);
		
		// Which planets have rings?
		System.out.println("Has one or more rings: " + listFilteredPlanets(planetList, (Planet p) -> p.isRinged()));
		
		// Which planets are blue and have moons?
		System.out.print("Has moons and is blue: ");
		planetList.stream().filter(p -> p.getNumberOfMoons() > 0 & (p.getPrimaryColor() == Color.BLUE))
				.forEach(s -> System.out.print(s + " "));
		
		// Which planets have more than twenty moons?
		System.out.println("\nHas over twenty moons: " + filterPlanets(planetList, hasMoonsMoreThan(20)));
		
		// Which planet has a color (other than black)
		System.out.print("Has a color not black: ");
		planetList.stream().filter(hasAColor()).forEach(s -> System.out.print(s + " "));
		
		// Which planets have moons?
		planetList.removeIf((Planet p) -> {
			return (p.getNumberOfMoons() == 0);
		});
		System.out.println("\nHas one or more moons: " + planetList);
	}
}
