package NilaiMahasiswa;
import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--------INPUT NILAI MAHASISWA --------");
        
        System.out.print("NIM : ");
        String nim = input.nextLine();
        
        System.out.print("Nama : ");
        String nama = input.nextLine();
        
        System.out.print("Mata kuliah : ");
        String mataKuliah = input.nextLine();
        
        System.out.print("Nilai presensi: ");
        double nilaiPresensi = input.nextDouble();
        
        System.out.print("Nilai tugas : ");
        double nilaiTugas = input.nextDouble();
        
        System.out.print("Nilai UAS : ");
        double nilaiUAS = input.nextDouble();

        double rataRata = (0.3 * nilaiPresensi + 0.3 * nilaiTugas + 0.3 * nilaiUAS);
        System.out.println("Rata rata : " + rataRata);

        
    }
}

