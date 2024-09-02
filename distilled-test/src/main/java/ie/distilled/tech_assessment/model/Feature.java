package ie.distilled.tech_assessment.model;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Feature{
	
	private String name;
	private String value;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getValue() {
		if(this.name.equals("engineSize")) {
			return (Double.valueOf(this.value) / 1000.0) + " L";
		} else if (this.name.equals("batteryRange")) {
			return this.value +  " kms";
		}
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, value);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feature other = (Feature) obj;
		return Objects.equals(name, other.name) && Objects.equals(value, other.value);
	}
	
	@Override
	public String toString() {
		return "Feature [name=" + name + ", value=" + value + "]";
	}
	
}
