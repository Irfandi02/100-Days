package perulanganfor;
import java.util.Scanner;

public class perulanagnfor {

  public static void main(String[] args) {
    Scanner masuk = new Scanner(System.in);
    int awal, akhir;
    System.out.println("Bilangan ganjil");
    System.out.print("awal :");
    awal = masuk.nextInt();
    System.out.print("akhir :");
    akhir = masuk.nextInt();

    if (awal < akhir) {
      for (int a = awal; a <= akhir; a++) {
        int hasil = a % 2;
        if (hasil == 1) {
          System.out.print(a + " ");
        }
      }
      System.out.println("");
    } else {
      System.out.println("awal > akhir");
    }
  }
}
