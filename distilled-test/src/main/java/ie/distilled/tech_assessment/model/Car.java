package ie.distilled.tech_assessment.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

  private int id;
  private String make;
  private String model;
  private List<Feature> features;

}
