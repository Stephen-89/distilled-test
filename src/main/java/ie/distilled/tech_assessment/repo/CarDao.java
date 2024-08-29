package ie.distilled.tech_assessment.repo;

import java.util.List;

import org.springframework.stereotype.Component;

import ie.distilled.tech_assessment.enums.FeatureEnum;
import ie.distilled.tech_assessment.enums.FuelTypeEnum;
import ie.distilled.tech_assessment.enums.TransmissionEnum;
import ie.distilled.tech_assessment.model.Car;
import ie.distilled.tech_assessment.model.Feature;

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
						List.of(new Feature(FeatureEnum.FUEL_TYPE.label, FuelTypeEnum.PETROL.label), 
								new Feature(FeatureEnum.TRANSMISSION.label, TransmissionEnum.MANUAL.label),
								new Feature(FeatureEnum.ENGINE_SIZE.label, "1600"))),
				new Car(2, "Ford", "Focus",
						List.of(new Feature(FeatureEnum.FUEL_TYPE.label, FuelTypeEnum.DIESEL.label), 
								new Feature(FeatureEnum.TRANSMISSION.label, TransmissionEnum.AUTOMATIC.label),
								new Feature(FeatureEnum.ENGINE_SIZE.label, "2200"))),
				new Car(3, "Volkswagen", "ID.4",
						List.of(new Feature(FeatureEnum.FUEL_TYPE.label, FuelTypeEnum.ELECTRIC.label), 
								new Feature(FeatureEnum.TRANSMISSION.label, TransmissionEnum.AUTOMATIC.label),
								new Feature(FeatureEnum.BATTERY_RANGE.label, "450"))),
				new Car(4, "Toyota", "Corolla",
						List.of(new Feature(FeatureEnum.FUEL_TYPE.label, FuelTypeEnum.PETROL.label), 
								new Feature(FeatureEnum.TRANSMISSION.label, TransmissionEnum.MANUAL.label),
								new Feature(FeatureEnum.ENGINE_SIZE.label, "1600"))),
				new Car(5, "Ford", "Mustang",
						List.of(new Feature(FeatureEnum.FUEL_TYPE.label, FuelTypeEnum.DIESEL.label), 
								new Feature(FeatureEnum.TRANSMISSION.label, TransmissionEnum.AUTOMATIC.label),
								new Feature(FeatureEnum.ENGINE_SIZE.label, "2200"))),
				new Car(6, "Volkswagen", "ID.3", 
						List.of(new Feature(FeatureEnum.FUEL_TYPE.label, FuelTypeEnum.ELECTRIC.label),
								new Feature(FeatureEnum.TRANSMISSION.label, TransmissionEnum.AUTOMATIC.label), 
								new Feature(FeatureEnum.BATTERY_RANGE.label, "350"))));
	}
}
