
# Car Listing Management System

## Overview

This project implements a REST API for managing car listings. The system retrieves car data from a database and returns it to the client in a structured format. The project includes the following main components:
- `Car` class with attributes such as `make`, `model`, and a list of `features`.
- `Feature` class representing different features of the car.
- [CarDao.java](src%2Fmain%2Fjava%2Fie%2Fdistilled%2Ftech_assessment%2Frepo%2FCarDao.java) class for data access operations to retrieve car information from the database.

## Requirements

- Implement a REST API to return list of car data from the database.
- Handle special mapping conditions for certain car features.

## Features

### Car Class
- Attributes:
    - `make`: The manufacturer of the car (e.g., Toyota, Ford).
    - `model`: The model of the car (e.g., Corolla, Focus).
    - `features`: A list of features associated with the car.

### Feature Class
- Attributes:
    - `fuelType`: Type of fuel the car uses (possible values: `petrol`, `diesel`, `electric`).
    - `transmission`: Type of transmission (possible values: `automatic`, `manual`).
    - `engineSize`: Engine size in cubic centimeters (cc).
    - `batteryRange`: Battery range in kilometers (only for electric cars).

## Special Mapping Conditions

- `engineSize`: Map from cc to liters only for non-electric cars (petrol, diesel).
    - Example: `1600 cc` should be mapped as `1.6 L`.
- `batteryRange`: Include this feature only for electric cars.

### Future Enhancements
- Additional features may be added in the future (e.g., year, color, price).

## Project Structure

- `Car.java`: Class definition for Car.
- `Feature.java`: Class definition for Feature.
- `CarDao.java`: Class for data access operations to retrieve car data from the database.
- `CarController.java`: REST API controller to handle HTTP requests and responses.

## Usage

### Loading Cars from Database
To retrieve the list of cars from the database, call the `loadCars()` method from the `CarDao` class. This method returns a list of `Car` objects.


### Example Response
```json
[
  {
    "make": "Toyota",
    "model": "Corolla",
    "features": [
      {"fuelType": "petrol"},
      {"transmission": "automatic"},
      {"engineSize": "1.6 L"}
    ]
  },
  {
    "make": "Tesla",
    "model": "Model S",
    "features": [
        {"fuelType": "electric"},
        {"transmission": "automatic"},
        {"batteryRange": "600 kms"}
    ]
  }
]
```

## Configuration

1. Clone the repository.
2. Build and run the application using IDE of your choice.

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.
---

