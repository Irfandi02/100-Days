package Day6;
import java.util.Scanner;
public class Day6 {

  public static void main(String[] args) {
   
   Scanner input = new Scanner (System.in);

   String nama;
   String alamat;
   String klas;
   String jurusan;
   
   System.out.println("nama \t: ");
   nama = input.nextLine();
   System.out.println("alamat \t: ");
   alamat = input.nextLine();
   System.out.println("klas \t ");
   klas = input.nextLine();
   System.out.println("jurusan \t ");
   jurusan = input.nextLine();
   
   
   System.out.println("nama saya" + nama);
   System.out.println("alamat saya" + alamat);
   System.out.println("klas saya" + klas);
   System.out.println("jurusan saya" + jurusan);

   
  }
}
