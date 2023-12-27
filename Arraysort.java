package day80;

import java.util.*;

public class day80 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka = new int[5];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka -" + (i + 1) + " : ");
            angka[i] = input.nextInt();
        }
        System.out.println("Sebelum Sorting : \n" + Arrays.toString(angka));

        Arrays.sort(angka);
        System.out.println("Setelah Sorting : \n" + Arrays.toString(angka));
    }

}
