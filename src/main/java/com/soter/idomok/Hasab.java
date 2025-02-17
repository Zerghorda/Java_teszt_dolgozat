package com.soter.idomok;

public class Hasab extends FaIdom {
    private double A,B,M;
    public Hasab(double A, double B, double M) {
        this.A = A;
        this.B = B;
        this.M = M;
    }

    public double terfogat() {
        return A * B * M;
    }

    public double suly() {
        return terfogat() * getFajsuly();
    }
    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getM() {
        return M;
    }

}
