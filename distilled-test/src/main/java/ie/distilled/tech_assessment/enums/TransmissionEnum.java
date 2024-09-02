package ie.distilled.tech_assessment.enums;

public enum TransmissionEnum {

	MANUAL("Manual"), AUTOMATIC("Automatic");

	public final String label;

	private TransmissionEnum(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
