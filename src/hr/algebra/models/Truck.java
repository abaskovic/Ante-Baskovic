package hr.algebra.models;

public class Truck extends Vehicle implements Chargeble{

    public Truck(int id, String registration, Double gas) {
        super(id, registration, gas);
    }

    @Override
    public double calculateCharge() {
        return 90.00;
    }
}
