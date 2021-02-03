package hr.algebra.models;

public class Car extends Vehicle implements Chargeble{

    public Car(int id, String registration, Double gas) {
        super(id, registration, gas);
    }

    @Override
    public double calculateCharge() {
        return 50;
    }
}
