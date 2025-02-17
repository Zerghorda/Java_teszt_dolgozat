package com.soter.idomok;

public class Gomb extends FaIdom {
    private double r;
    public Gomb(double r) {
        this.r  =r;
    }
    public double terfogat() {
        return r*2/Math.PI ;
    }
    public double suly() {
        return 4*Math.pow(r,3)/(Math.PI/3);
    }
}
