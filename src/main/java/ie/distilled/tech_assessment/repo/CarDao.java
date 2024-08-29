package ie.distilled.tech_assessment.repo;

import ie.distilled.tech_assessment.model.Car;
import ie.distilled.tech_assessment.model.Feature;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class CarDao {

	/**
	 * Load a list of cars. Mocked data, you don't have to worry about loading them
	 * from database
	 * 
	 * @return a list of cars
	 */
	public List<Car> loadCars() {
		return List.of(
				new Car(1, "Toyota", "Corolla",
						List.of(new Feature("fuelType", "Petrol"), 
								new Feature("transmission", "Manual"),
								new Feature("engineSize", "1600"))),
				new Car(2, "Ford", "Focus",
						List.of(new Feature("fuelType", "Diesel"), 
								new Feature("transmission", "Automatic"),
								new Feature("engineSize", "2200"))),
				new Car(3, "Volkswagen", "ID.4",
						List.of(new Feature("fuelType", "Electric"), 
								new Feature("transmission", "Automatic"),
								new Feature("batteryRange", "450"))),
				new Car(4, "Toyota", "Corolla",
						List.of(new Feature("fuelType", "Petrol"), 
								new Feature("transmission", "Manual"),
								new Feature("engineSize", "1600"))),
				new Car(5, "Ford", "Mustang",
						List.of(new Feature("fuelType", "Diesel"), 
								new Feature("transmission", "Automatic"),
								new Feature("engineSize", "2200"))),
				new Car(6, "Volkswagen", "ID.3", 
						List.of(new Feature("fuelType", "Electric"),
								new Feature("transmission", "Automatic"), 
								new Feature("batteryRange", "350"))));
	}
}
