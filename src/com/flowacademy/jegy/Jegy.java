package com.flowacademy.jegy;

public class Jegy {
    private int ervenyesKm;
    private String celallomas;
    private boolean valid;
    private float kedvezmeny;
    private static int KM_EGYSEGAR = 25;

    public Jegy(String celallomas, int ervenyesKm, int kedvezmeny) {
        this.celallomas = celallomas;
        this.ervenyesKm = ervenyesKm;
        this.kedvezmeny = kedvezmeny;
        this.valid = true;
    }


    public int getErvenyesKm() {
        return ervenyesKm;
    }

    public void setErvenyesKm(int ervenyesKm) {
        this.ervenyesKm = ervenyesKm;
    }

    public String getCelallomas() {
        return celallomas;
    }

    public void setCelallomas(String celallomas) {
        this.celallomas = celallomas;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public float getKedvezmeny() {
        return kedvezmeny;
    }

    public void setKedvezmeny(int kedvezmeny) {
        this.kedvezmeny = kedvezmeny;
    }

    public static int getKmEgysegar() {
        return KM_EGYSEGAR;
    }

    public static void setKmEgysegar(int kmEgysegar) {
        KM_EGYSEGAR = kmEgysegar;
    }

    public int arKiszamit() {
        return Math.round((ervenyesKm * KM_EGYSEGAR) - ((ervenyesKm * KM_EGYSEGAR) * (kedvezmeny / 100)));
    }

    public void felHasznal(){
        valid = false;
    }

    @Override
    public String toString() {
        return "Cél: " + celallomas +
                "; Kedvezmény: " + kedvezmeny +
                "; Távolság: " + ervenyesKm +
                "; Jegyár: " + arKiszamit();
    }
}
