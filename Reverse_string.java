package Reverse_string;
import java.util.Scanner;
public class reversestring{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String a = sc.nextLine();
        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i) + " ");
        }
        System.out.println();
    }
