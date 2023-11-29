package polapersegipanjang;

import java.util.Scanner;

public class polapersegipanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        int panjang = input.nextInt();

        System.out.print("Masukkan lebar persegi panjang: ");
        int lebar = input.nextInt();

        // Cetak pola persegi panjang
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
