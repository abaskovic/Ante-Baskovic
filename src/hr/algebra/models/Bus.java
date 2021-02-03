package hr.algebra.models;

public class Bus extends Vehicle implements Chargeble{

    public Bus(int id, String registration, Double gas) {
        super(id, registration, gas);
    }

    @Override
    public double calculateCharge() {
        return 70.00;
    }

}
