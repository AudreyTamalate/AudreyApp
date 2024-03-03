package com.example.duaduasi.warungapps.Model;

public class Produk {
    private String namaProduk;
    private int hargaProduk;
    private int gambarproduk;

    public Produk(String namaProduk, int hargaProduk, int gambarproduk) {
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.gambarproduk = gambarproduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(int hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public int getGambarproduk() {
        return gambarproduk;
    }

    public void setGambarproduk(int gambarproduk) {
        this.gambarproduk = gambarproduk;
    }
}
