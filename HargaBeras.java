package HargaBeras;
import java.util.Scanner;

public class HargaBeras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaPerKarung = 500000;
        double diskon = 0;
        System.out.println("---------*----------------*--------");
        System.out.println("----------TOKO BERAS----------");
        System.out.println("-----------------------------------");
        System.out.println("Harga perkarung Rp 500.000 :");
        System.out.println("jika membeli >=300 mendapatkan diskon 7% :");
        System.out.println("jika membeli >=150 mendapatkan diskon 3% :");
        System.out.println("-----------------------------------");

        System.out.print("Masukkan jumlah beras yang dibeli: ");
        int jumlahKarung = input.nextInt();
        System.out.println("-----------------------------------");

        if (jumlahKarung >= 300) {
            diskon = 0.07;
              System.out.println("Anda mendapatkan diskon 7%.");
        } else if (jumlahKarung >= 150) {
            diskon = 0.03;
            System.out.println("Anda mendapatkan diskon 3%.");
        } else {
            System.out.println("Anda tidak mendapatkan diskon.");
        }

        double totalHarga = jumlahKarung * hargaPerKarung;
        double hargaDiskon = totalHarga - (totalHarga * diskon);

        System.out.println("Harga yang harus anda bayar adalah: Rp." + hargaDiskon);

        System.out.println("------------------------------------");
    }
}
