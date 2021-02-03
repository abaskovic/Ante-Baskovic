package hr.algebra.models;

public class Van extends Vehicle implements Chargeble{

    public Van(int id, String registration, Double gas) {
        super(id, registration, gas);
    }

    @Override
    public double calculateCharge() {
        return 80.00;
    }
}
