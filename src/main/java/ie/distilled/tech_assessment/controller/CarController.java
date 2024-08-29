package ie.distilled.tech_assessment.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ie.distilled.tech_assessment.model.Car;
import ie.distilled.tech_assessment.repo.CarService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CarController {

	private CarService carService;
	
	@GetMapping("/cars")
	public ResponseEntity<List<Car>> getAllCars(){
		return new ResponseEntity<>(carService.getAllCars(), HttpStatus.OK);
	}
	

	@GetMapping("/cars-filter")
	public ResponseEntity<List<Car>> getAllCarsFilteredByFuleType(@RequestParam String fuelType){
		return new ResponseEntity<>(carService.getAllCarsFilteredByFuleType(fuelType), HttpStatus.OK);
	}
	
	
}
