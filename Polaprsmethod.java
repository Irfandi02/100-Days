package polamethod;

import java.util.Scanner;

public class polamethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ukuran persegi: ");
        int ukuranPersegi = scanner.nextInt();

        buatPolaPersegi(ukuranPersegi);
    }

    static void buatPolaPersegi(int ukuran) {
        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
