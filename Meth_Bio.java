package bio;

import java.util.Scanner;

public class bio {

    public static void main(String[] args) {
        System.out.print("Masukkan Nama: ");
        String nama = nama();
        System.out.println("Nama: " + nama);
        
        System.out.print("Masukkan Alamat :");
        String almt = almt();
        System.out.println("Alamat :"+almt);

        System.out.print("Masukkan Umur: ");
        int umur = umur();
        System.out.println("Umur: " + umur);
          
    }
    public static String nama() {
        return new Scanner(System.in).nextLine();
    }
    public static String almt() {
        return new Scanner(System.in).nextLine();
    }  
    public static int umur() {
      return new Scanner (System.in).nextInt();
    }
