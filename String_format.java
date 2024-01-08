package com.mycompany.stringformat;

public class Stringformat {

    public static void main(String[] args) {
        String nama = "irfandi";
        int umur = 17;
        double tinggi = 180.5;

        String hasil = String.format("Nama: %s, Umur: %d, Tinggi: %.2f", nama, umur, tinggi);
        System.out.println(hasil);
    }
}
