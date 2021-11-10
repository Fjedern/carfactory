package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarFactoryTest {
    @Test
    void test_create_car_success() {
        VehicleRegistrationNumberGenerator vehicleRegistrationNumberGenerator = new VehicleRegistrationNumberGenerator(List.of("ABC123"));
        CarFactory carFactory = new CarFactory(vehicleRegistrationNumberGenerator, "Saab");


        Car car = carFactory.createNewCar("900", "Red");

        assertNotNull(car);
        assertEquals("Red", car.getColor());
        assertEquals("Saab", car.getBrand());
        assertEquals("ABC123", car.getRegNo());
        System.out.println(car.getRegNo());
    }

    @ParameterizedTest
    @CsvSource({
            "900,Gasoline,90,4",
            "900 Turbo,Gasoline/Turbo,150,4",
            "93,Gasoline,110,4",
            "93 aero,Gasoline/Turbo,190,4",
            "9-7X,Diesel/Turbo,170,6"
    })
    void test_create_car_with_model_success(String model, String engineType, int enginePower, int numberOfPassengers) {
        VehicleRegistrationNumberGenerator vehicleRegistrationNumberGenerator = new VehicleRegistrationNumberGenerator(List.of("ABC123"));
        CarFactory carFactory = new CarFactory(vehicleRegistrationNumberGenerator, "Saab");

        Car car = carFactory.createNewCar(model, "Red");

        assertNotNull(car);
        assertEquals(engineType, car.getEngineType());
        assertEquals(enginePower, car.getEnginePower());
        assertEquals(numberOfPassengers, car.getNumberOfPassengers());

    }
}

