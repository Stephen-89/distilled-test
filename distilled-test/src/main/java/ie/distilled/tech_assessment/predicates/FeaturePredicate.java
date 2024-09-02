package ie.distilled.tech_assessment.predicates;

import java.util.function.Predicate;

import ie.distilled.tech_assessment.enums.FeatureEnum;
import ie.distilled.tech_assessment.model.Feature;

public class FeaturePredicate {

	private FeaturePredicate() {
	}

	public static Predicate<Feature> filterByFuelType(String fuelType) {
		return feature -> feature.getName().equalsIgnoreCase(FeatureEnum.FUEL_TYPE.label)
				&& feature.getValue().equalsIgnoreCase(fuelType);
	}

	public static Predicate<Feature> filterByTransmission(String transmission) {
		return feature -> feature.getName().equalsIgnoreCase(FeatureEnum.TRANSMISSION.label)
				&& feature.getValue().equalsIgnoreCase(transmission);
	}

	public static Predicate<Feature> filterByEngineSize(String engineSize) {
		return feature -> feature.getName().equalsIgnoreCase(FeatureEnum.ENGINE_SIZE.label)
				&& feature.getValue().equalsIgnoreCase(engineSize);
	}

	public static Predicate<Feature> filterByBatteryRange(String batteryRange) {
		return feature -> feature.getName().equalsIgnoreCase(FeatureEnum.BATTERY_RANGE.label)
				&& feature.getValue().equalsIgnoreCase(batteryRange);
	}

}
