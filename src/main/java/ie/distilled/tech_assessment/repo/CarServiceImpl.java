package ie.distilled.tech_assessment.repo;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ie.distilled.tech_assessment.model.Car;
import ie.distilled.tech_assessment.model.Feature;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService {

	private CarDao carDao;

	@Override
	public List<Car> getAllCars() {
		List<Car> cars = carDao.loadCars();
		return cars;
	}

	@Override
	public List<Car> getAllCarsFilteredByFuleType(String fuelType) {
		
		List<Car> cars = carDao.loadCars();
		
		List<Car> cars2 = cars.stream().filter(filterOnFuleType(fuelType)).collect(Collectors.toList());
		
		cars2.forEach(car -> {
			car.getFeatures().forEach(feature -> {
				if(feature.getName().equalsIgnoreCase("engineSize")) {
					feature.setValue((Double.valueOf(feature.getValue()) / 1000.0) + " L");
				} else if (feature.getName().equalsIgnoreCase("batteryRange")) {
					feature.setValue(feature.getValue() + " kms");
				}
			});
		});
		
		return cars2;
		
	}

	private Predicate<? super Car> filterOnFuleType(String fuelType) {
		return car -> car.getFeatures().contains(new Feature("fuelType", fuelType));
	}
	
}
