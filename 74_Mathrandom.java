package day74;

import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int batas = input.nextInt();

        double random = Math.random() * batas;
        System.out.println("Angka acak antara 0 dan " + batas + ": " + random);

        input.close();
    }
}
