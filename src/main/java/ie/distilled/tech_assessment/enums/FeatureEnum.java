package ie.distilled.tech_assessment.enums;

public enum FeatureEnum {

	FUEL_TYPE("fuelType"), TRANSMISSION("transmission"), ENGINE_SIZE("engineSize"), BATTERY_RANGE("batterySize");

	public final String label;

	private FeatureEnum(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}

}
