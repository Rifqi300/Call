package com.rifqi.calll;

import java.io.Serializable;

public class Hero implements Serializable {
    private String nama;
    private int imghero;

    public Hero(String nama, int imghero) {
        this.nama = nama;
        this.imghero = imghero;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getImghero() {
        return imghero;
    }

    public void setImghero(int imghero) {
        this.imghero = imghero;
    }
}
