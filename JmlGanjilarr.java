package mjl_arrganjil;

public class mjlarrganjil {
    public static void main(String[] args) {
    
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int totalGanjil = JumlahBilanganGanjil(array);

        System.out.println("Jumlah bilangan ganjil dalam array: " + totalGanjil);
    }

    static int JumlahBilanganGanjil(int[] arr) {
        int total = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                total += i;
            }
        }
        return total;
    }
}
