package coding;
import java.util.Scanner;

public class coding {

    public static void main(String[] args) {
    
    // menentukan nilai maksimal dan minimal
    
        Scanner input = new Scanner(System.in);
        int jml, angka, maks = 0, min = 100;

        System.out.print("jumblah angka :");
        jml = input.nextInt();
        System.out.println("----------------");

        for (int i = 1; i <= jml; i++) {
            System.out.print("angka ke -" + i + " = ");
            angka = input.nextInt();

            if (angka > maks) {
                maks = angka;
            }
            if (angka < min) {
                min = angka;
            }
        }

        System.out.println("------------------");
        System.out.println(" nilai maks = " +maks);
        System.out.println(" nilai min = " +min);
    }
}
