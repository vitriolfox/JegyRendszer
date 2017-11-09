package com.flowacademy.jegy;

public class Return extends Jegy {
    private int hasznalatokSzama = 0;

    public Return(String celallomas, int ervenyesKm, int kedvezmeny) {
        super(celallomas, ervenyesKm, kedvezmeny);
        this.hasznalatokSzama = 0;
    }


    public int getHasznalatokSzama() {
        return hasznalatokSzama;
    }

    public void setHasznalatokSzama(int hasznalatokSzama) {
        this.hasznalatokSzama = hasznalatokSzama;
    }

    @Override
    public void felHasznal(){
        if (hasznalatokSzama >= 2) {
            setValid(false);
        } else {
            hasznalatokSzama++;
        }
    }

    @Override
    public int arKiszamit() {
        return super.arKiszamit()*2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "; RETURN-JEGY";
    }
}
