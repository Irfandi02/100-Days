package mjumlaharr;

import java.util.Scanner;

public class mjumlaharr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris array : ");
        int jumlahBaris = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom array: ");
        int jumlahKolom = scanner.nextInt();

        int[][] arr = new int[jumlahBaris][jumlahKolom];

        System.out.println("Masukkan elemen-elemen array:");

        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        int total = 0;

        // Menggunakan for each untuk menjumlahkan nilai dalam array 2 dimensi
        for (int[] baris : arr) {
            for (int angka : baris) {
                total += angka;
            }
        }
        System.out.println("---------------------------------");

        System.out.println("Total penjumlahan array 2 dimensi: " + total);
        
    }
}
