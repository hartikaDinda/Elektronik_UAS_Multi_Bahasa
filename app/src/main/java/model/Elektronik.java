package model;

import java.io.Serializable;

public class Elektronik implements Serializable {
    private String elektronik;
    private String nama;
    private String jenis;
    private String deskripsi;
    private int drawableRes;

    public Elektronik(String elektronik, String nama, String jenis, String deskripsi, int drawableRes) {
        this.elektronik = elektronik;
        this.nama = nama;
        this.jenis = jenis;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getElektronik() {
        return elektronik;
    }

    public void setElektronik(String elektronik) {
        this.elektronik = elektronik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
