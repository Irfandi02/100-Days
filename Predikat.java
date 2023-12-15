package andi;
import java.util.Scanner;
public class predikat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();
        String predikat =
          (nilai > 90 && nilai <= 100) ? "Nilai A sangat Baik" :
          (nilai > 75 && nilai <= 90) ? "Nilai B => Baik" :
          (nilai > 69 && nilai <= 75) ? "Nilai C => Cukup baik" :
          (nilai > 60 && nilai <= 65) ? "Nilai D => Cukup" :
          "Nilai anda eror!!! kasian banget";
        System.out.println(predikat);
    }

    public static void nilai() {
      nilai();
    }
}
