package com.soter.idomok;

public class Gomb extends FaIdom {
    private double r;
    public Gomb(double r) {
        this.r  = r;
    }
    public double terfogat() {
        return 4 * Math.pow(r,3) / (Math.PI/3) ;
    }
    public double suly() {
        return terfogat()*getFajsuly();
    }
}
