package Hitungluaslingkaran;
import java.util.Scanner;
 public class Hitungluaslingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // masukkan jari jari lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        // Menghitung luas lingkaran
        double luas = Math.PI * jariJari * jariJari;

        // Menampilkan hasil
        System.out.println("Luas lingkaran adalah: " + luas);

        // Menutup objek Scanner
        input.close();
    }
 }
