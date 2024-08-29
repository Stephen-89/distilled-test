package ie.distilled.tech_assessment.repo;

import java.util.List;

import ie.distilled.tech_assessment.model.Car;

public interface CarService {

	public List<Car> getAllCars();
	
	public List<Car> getAllCarsFilteredByFuleType(String fuleType);
	
}
