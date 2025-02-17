package com.soter;

import com.soter.idomok.FaIdom;
import com.soter.idomok.Gomb;
import com.soter.idomok.Hasab;

import java.util.ArrayList;

public class FaIdomokProgram {
    private ArrayList<FaIdom> lista;

    public FaIdomokProgram() {
        this.lista = new ArrayList<>();
    }

    public void ujIdom(Gomb gomb) {

    }

    public void ujIdom(Hasab hasab) {
    }

    public ArrayList<FaIdom> getLista() {
        ArrayList<FaIdom> peldany = new ArrayList<>(lista);
    return peldany;
    }

    public double osszSuly() {
        double ossz = 0;
        return ossz;
    }

    public double gombokOsszSuly() {
        double osszeg=0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == Gomb){
             //
            }
        }
        return 0 ;
    }

    public FaIdom minV() {
        return null;
    }

    public FaIdom maxV() {
        return null;
    }
}
