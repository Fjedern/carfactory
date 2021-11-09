package org.example;

public class CarFactory {
    VehicleRegistrationNumberGenerator vehicleRegistrationNumberGenerator;
    String brand;

    public CarFactory(VehicleRegistrationNumberGenerator vehicleRegistrationNumberGenerator, String brand) {
        this.vehicleRegistrationNumberGenerator = vehicleRegistrationNumberGenerator;
        this.brand = brand;
    }

    public Car createNewCar(String color) {
        return new Car(color, this.brand, vehicleRegistrationNumberGenerator.getNextRegNo());
    }
}
