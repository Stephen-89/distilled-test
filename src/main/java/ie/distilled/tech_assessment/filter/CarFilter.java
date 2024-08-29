package ie.distilled.tech_assessment.filter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarFilter {
	
	private String make;
	private String model;
	
	// Additional features
	// private String year;
	// private String color;
	// private String price;
	
	private String fuelType;
	private String transmission;
	private String engineSize;
	private String batteryRange;

}
