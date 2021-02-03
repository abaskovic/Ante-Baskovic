package hr.algebra.models;

import java.util.List;

public class Emoloyee10  extends  Employee implements Employeer {


    public Emoloyee10(String name, String surname) {
        super(name, surname);
    }

    @Override
    public double calculateSalery(List<Vehicle> vehicleList) {

         double profit = 0;

            for (Vehicle v : vehicleList) {
                profit += v.calculateCharge() * 0.1;
            }
            return  profit;






    }

    @Override
    public void charge(Vehicle vehicle) {

        if (vehicle.isEmpty()){
            System.out.println("Gas <10%! charged!");
            vehicle.setGasProcent(100.00);
        }
        System.out.println("Gas: " + vehicle.getGasProcent()+"%");


    }
}


