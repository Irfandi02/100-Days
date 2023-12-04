package kiw;

public class kiw {
    public static void main(String[] args) {
        int[] arrayAngka = {1, 2, 3, 4, 5};
        int[] arrayAngka1 = {6, 9, 1, 4, 7};

        // Menggunakan metode penjumlahanArray untuk menjumlahkan dua array
        int hasilJumlah = jumlahArray(arrayAngka, arrayAngka1);

        System.out.println("Hasil Jumlah Array: " + hasilJumlah);
    }

    public static int jumlahArray(int[] array1, int[] array2) {
        int jumlah = 0;

        // Menjaga asumsi bahwa kedua array memiliki panjang yang sama
        for (int i = 0; i < array1.length; i++) {
            jumlah += array1[i] + array2[i];
        }

        return jumlah;
    }
}


