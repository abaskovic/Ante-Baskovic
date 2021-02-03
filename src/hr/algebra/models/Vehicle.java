package hr.algebra.models;

import java.util.List;

public  class Vehicle implements Chargeble {
    public Vehicle(int id, String registration, Double gasProcent) {
        this.id = id;
        this.registration = registration;
        this.gasProcent = gasProcent;
    }

    public Vehicle() {
    }

    private  int id;

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Double getGasProcent() {
        return gasProcent;
    }

    public void setGasProcent(Double gasProcent) {
        this.gasProcent = gasProcent;
    }

    private String  registration;
    private Double  gasProcent;


    @Override
    public double calculateCharge() {
        return 0;
    }

    public boolean isEmpty(){
        boolean ok=true;
        if (gasProcent>10){
            ok= false;
        }
        return ok;
    }
    }

