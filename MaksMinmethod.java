package MaksMinmethod;
import java.util.Scanner;

public class MaksMinmethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.print("Masukkan elemen array:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int max = findMax(array);
        int min = findMin(array);

        System.out.println("Nilai Maksimal: " + max);
        System.out.println("Nilai Minimal: " + min);
    }
    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
