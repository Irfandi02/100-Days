package arr;
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah index : ");
        int index = input.nextInt();
        
        int [] arr = new int [index];

        double rata_rata = 0;

        for (int i = 0; i < index; i++) {
            System.out.print("Nilai " + (i + 1) + " : ");
            double nilai = input.nextDouble();
            rata_rata += nilai;
        }

        System.out.println("Rata_rata = " + rata_rata / index);
    }
}
