package lambdas;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javafx.scene.paint.Color;

public interface PlanetPredicates {

	static Predicate<Planet> hasMoonsMoreThan(Integer moons) {
		return p -> p.getNumberOfMoons() > moons;
	}

	static Predicate<Planet> hasAColor() {
		return p -> p.getPrimaryColor() != Color.BLACK;
	}

	static List<Planet> filterPlanets(List<Planet> planetList, Predicate<Planet> predicate) {
		return planetList.stream().filter(predicate).collect(Collectors.<Planet>toList());
	}

	static StringBuilder listFilteredPlanets(List<Planet> planetList, Predicate<Planet> predicate) {
		StringBuilder planets = new StringBuilder();
		planetList.stream().filter((planet) -> (predicate.test(planet))).forEach((planet) -> {
			planets.append(planet).append(" ");
		});

		return planets;
	}
}
