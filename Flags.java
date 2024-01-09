package com.mycompany.flags;

import java.util.Scanner;

public class Flags {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("[flags]");

        System.out.print("Masukkan angka1: ");
        int bilangan1 = input.nextInt();

        System.out.print("Masukkan angka2: ");
        int bilangan2 = input.nextInt();

        int hasil = bilangan1 - bilangan2;

        System.out.printf("%d - %d = %-d", bilangan1, bilangan2, hasil);

        input.close();
    }
}
