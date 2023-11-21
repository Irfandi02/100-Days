package day44;
import java.util.Scanner;

public class SearchArray {

    public static void main(String[] args) {

        int[] a = {3, 5, 4, 2, 8, 9, 2, 0, 6};
        int cari, _search = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("data : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.print("Cari :");
        cari = input.nextInt();
        System.out.println("----------");
        System.out.print("Hasil cari : ");
        for (int i = 0; i < a.length; i++) {
            if (cari == a[i]) {
                _search++;
                System.out.print("index - " + i + " ");
            }
        }
        if (_search == 0) {
            System.out.print("data tidak ada !");
        }
    }
}
