package hr.algebra.models;

public class BigTrain extends Train implements Capacitor {

    public BigTrain(int id, String reg) {
        super(id, reg);
    }

    @Override
    public int Capacity() {
        return 6;
    }



}
