package ie.distilled.tech_assessment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ie.distilled.tech_assessment.comparators.CarComparator;
import ie.distilled.tech_assessment.exceptions.ResourceNotFoundException;
import ie.distilled.tech_assessment.filter.CarFilter;
import ie.distilled.tech_assessment.model.Car;
import ie.distilled.tech_assessment.predicates.FeaturePredicate;
import ie.distilled.tech_assessment.repo.CarDao;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService {

	private CarDao carDao;

	@Override
	public List<Car> getAllCars() {
		return carDao.loadCars().stream().sorted(CarComparator.carMakeComparator()).toList();
	}

	@Override
	public Car getCarFilteredBy(CarFilter carFilter) {
		Optional<Car> car = carDao
				.loadCars().stream().filter(
						carFiltered -> carFiltered.getFeatures().stream()
								.anyMatch(FeaturePredicate.filterByFuelType(carFilter.getFuelType())
										.or(FeaturePredicate.filterByTransmission(carFilter.getTransmission()))))
				.findFirst();
		if (car.isPresent()) {
			return car.get();
		} else {
			throw new ResourceNotFoundException(String.format("Car not found for Fuel Type %s and Transmission %s",
					carFilter.getFuelType(), carFilter.getTransmission()));
		}
	}

	@Override
	public List<Car> getCarsFilteredBy(CarFilter carFilter) {
		return carDao.loadCars().stream().filter(
				car -> car.getFeatures().stream().anyMatch(FeaturePredicate.filterByFuelType(carFilter.getFuelType())))
				.sorted(CarComparator.carMakeComparator()).toList();
	}

}
