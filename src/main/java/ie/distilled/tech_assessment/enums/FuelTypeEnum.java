package ie.distilled.tech_assessment.enums;

public enum FuelTypeEnum {

	PETROL("Petrol"), DIESEL("Diesel"), ELECTRIC("Electric"), HYBRID("Hybrid");

	public final String label;

	private FuelTypeEnum(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}

}
