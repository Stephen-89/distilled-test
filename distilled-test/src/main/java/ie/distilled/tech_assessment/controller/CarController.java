package ie.distilled.tech_assessment.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ie.distilled.tech_assessment.constants.RestUrl;
import ie.distilled.tech_assessment.filter.CarFilter;
import ie.distilled.tech_assessment.model.Car;
import ie.distilled.tech_assessment.service.CarService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CarController {

	private CarService carService;
	
	@GetMapping(RestUrl.CAR)
	public ResponseEntity<Car> getCarFilteredBy(@Validated @RequestBody CarFilter carFilter){
		return new ResponseEntity<>(carService.getCarFilteredBy(carFilter), HttpStatus.OK);
	}
	
	@GetMapping(RestUrl.CARS)
	public ResponseEntity<List<Car>> getAllCars(){
		return new ResponseEntity<>(carService.getAllCars(), HttpStatus.OK);
	}

	@GetMapping(RestUrl.CARS_FILTER)
	public ResponseEntity<List<Car>> getCarsFilteredBy(@Validated @RequestBody CarFilter carFilter){
		return new ResponseEntity<>(carService.getCarsFilteredBy(carFilter), HttpStatus.OK);
	}
	
}
