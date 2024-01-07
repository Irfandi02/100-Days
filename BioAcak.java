package com.mycompany.mavenproject12;

import java.util.Random;

public class Mavenproject12{
    public static void main(String[] args) {
        Random random = new Random();

        // Menghasilkan nama acak
        String[] namaArray = {"John", "dony", "ady", "dewi", "Charlie"};
        String nama = namaArray[random.nextInt(namaArray.length)];

        // Menghasilkan umur acak antara 18 dan 35 tahun
        int umur = random.nextInt(18) + 18;

        // Menghasilkan jenis kelamin acak (L/P)
        char jenisKelamin = (random.nextBoolean()) ? 'L' : 'P';

        System.out.println("\nBiodata:");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Jenis Kelamin: " + ((jenisKelamin == 'L') ? "Laki-laki" : "Perempuan"));
    }
}
