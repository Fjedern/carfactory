package org.example;

public class CarFactory {
    VehicleRegistrationNumberGenerator vehicleRegistrationNumberGenerator;
    String brand;

    public CarFactory(VehicleRegistrationNumberGenerator vehicleRegistrationNumberGenerator, String brand) {
        this.vehicleRegistrationNumberGenerator = vehicleRegistrationNumberGenerator;
        this.brand = brand;
    }

    public Car createNewCar(String model, String color) {
        switch (model) {
            case "900":
                return new Car(color, this.brand, vehicleRegistrationNumberGenerator.getNextRegNo(), "Gasoline", 90, 4);
            case "900 Turbo":
                return new Car(color, this.brand, vehicleRegistrationNumberGenerator.getNextRegNo(), "Gasoline/Turbo", 150, 4);
            case "93":
                return new Car(color, this.brand, vehicleRegistrationNumberGenerator.getNextRegNo(), "Gasoline", 110, 4);
            case "93 aero":
                return new Car(color, this.brand, vehicleRegistrationNumberGenerator.getNextRegNo(), "Gasoline/Turbo", 190, 4);
            case "9-7X":
                return new Car(color, this.brand, vehicleRegistrationNumberGenerator.getNextRegNo(), "Diesel/Turbo", 170, 6);
            default:
                throw new RuntimeException("Unknown model " + model);
        }

    }



    /*public addModel(String model, String engineType, String enginePower, int numberOfPassengers) {

    }*/
}
