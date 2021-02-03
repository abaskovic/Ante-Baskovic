package hr.algebra.models;

public class SmallTrain extends Train  implements Capacitor {



    public SmallTrain(int id, String reg) {
        super(id, reg);
    }



    @Override
    public int Capacity() {
        return 8;
    }


}
