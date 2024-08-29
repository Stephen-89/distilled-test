package ie.distilled.tech_assessment.service;

import java.util.List;

import ie.distilled.tech_assessment.filter.CarFilter;
import ie.distilled.tech_assessment.model.Car;

public interface CarService {

	public List<Car> getAllCars();
	public Car getCarFilteredBy(CarFilter carFilter);
	public List<Car> getCarsFilteredBy(CarFilter carFilter);
	
}
