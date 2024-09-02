package ie.distilled.tech_assessment.comparators;

import java.util.Comparator;

import ie.distilled.tech_assessment.model.Car;

public class CarComparator {

	private CarComparator() {}

	public static Comparator<Car> carMakeComparator() {
		return (s1, s2) -> s1.getMake().compareTo(s2.getMake());
	}

}
