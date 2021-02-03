package hr.algebra;

import hr.algebra.models.*;

import java.util.*;

public class Solid {

    public static void main(String[] args) {
	// write your code here

        Emoloyee10 employee10= new Emoloyee10("ante","antic");
        Employee11 employee11= new Employee11("sss", "jjjj");
        SmallTrain smallTrain= new SmallTrain(1,"MA-120-AS");
        BigTrain bigTrain= new BigTrain(2,"ZG-123-DA");


        List<Vehicle> smallTrainVehicles = new ArrayList<>(smallTrain.Capacity());
        List<Vehicle> bigTrainVehicles = new ArrayList<>(bigTrain.Capacity());

        List<Vehicle> allVehicles = new ArrayList<>();



        smallTrainVehicles.add(new Car(3,"ZG-111-KD",50.0));
        smallTrainVehicles.add(new Car(4,"MA-111-KD",9.0));
        smallTrainVehicles.add(new Car(5,"ZG-222-KD",70.0));

        smallTrainVehicles.add(new Van(6,"ZG-111-KD",50.0));
        smallTrainVehicles.add(new Van(7,"MA-111-KD",9.0));
        smallTrainVehicles.add(new Van(8,"ZG-222-KD",70.0));

        bigTrainVehicles.add(new Truck(9,"ZG-111-KD",50.0));
        bigTrainVehicles.add(new Truck(10,"MA-111-KD",50.0));
        bigTrainVehicles.add(new Truck(11,"ZG-222-KD",70.0));

        bigTrainVehicles.add(new Bus(12,"ZG-111-KD",50.0));
        bigTrainVehicles.add(new Bus(13,"MA-111-KD",9.0));
        bigTrainVehicles.add(new Bus(14,"ZG-222-KD",70.0));


        allVehicles.addAll(smallTrainVehicles);
        allVehicles.addAll(bigTrainVehicles);


        int profit =0;
        for (Vehicle v:allVehicles) {

            profit+=v.calculateCharge();
        }



        System.out.println("Terminal :"+profit);
        System.out.println("Employee1 salary: "+employee10.calculateSalery(allVehicles));
        employee10.charge(allVehicles.get(2));
        employee10.charge(allVehicles.get(1));
        System.out.println("Employee1 salary: "+employee11.calculateSalery(allVehicles));
        employee11.charge(allVehicles.get(10));
        employee11.charge(allVehicles.get(11));





    }
}
