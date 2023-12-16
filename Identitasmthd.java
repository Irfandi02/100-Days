package IdentitasMahasiswa;
import java.util.Scanner;
public class IdentitasMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama = bacaInput(input, "Masukkan nama: "); 
        String kelas = bacaInput(input, "Masukkan kelas: "); 
        String nim = bacaInput(input, "Masukkan NIM: "); 

        System.out.println("\nIdentitas Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("NIM: " + nim);

        input.close();
    } 

    public static String bacaInput(Scanner scanner, String ingat) {
        String input;
        do {
            System.out.print(ingat);
            input = scanner.nextLine();
        } while (input.isEmpty());
        return input;
    }
}
