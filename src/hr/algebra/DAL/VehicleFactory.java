package hr.algebra.DAL;

import hr.algebra.models.*;

import java.util.Locale;

public class VehicleFactory {

    public static Vehicle createVehicle(String type, int id, String registration, double Percent) {

        switch (type.toUpperCase(Locale.ROOT)) {
            case "CAR":
                return new Car(id, registration, Percent);

            case "BUS":
                return new Bus(id, registration, Percent);

            case "TRUCK":
                return new Truck(id, registration, Percent);

            case "VAN":
                return new Van(id, registration, Percent);

            default:
                return null;

        }

    }
}
