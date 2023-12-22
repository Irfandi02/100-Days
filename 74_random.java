package day75;

public class day75 {
    public static void main(String[] args) {
        int jumlahIterasi = 5;

        System.out.println("Menghasilkan nilai acak ");

        for (int i = 1; i <= jumlahIterasi; i++) {
            double nilaiAcak = Math.random();
            System.out.println("Iterasi ke-" + i + ": " + nilaiAcak);
        }
    }
}
