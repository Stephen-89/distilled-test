package ie.distilled.tech_assessment.repo;

import java.util.List;
import java.util.function.Predicate;

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
		return carDao.loadCars();
	}

	@Override
	public List<Car> getAllCarsFilteredByFuleType(String fuelType) {
		return carDao.loadCars().stream().filter(car -> car.getFeatures().stream().anyMatch(extracted(fuelType))).toList();
	}

	private Predicate<? super Feature> extracted(String fuelType) {
		return feature -> feature.getValue().equalsIgnoreCase(fuelType);
	}

}
