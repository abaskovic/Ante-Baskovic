package hr.algebra.models;

import java.util.List;

public interface Employeer {

    double calculateSalery(List<Vehicle> vehicleList);
    void charge(Vehicle vehicle);
}
