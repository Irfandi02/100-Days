package method_prosedur;
import java.util.Scanner;
public class metodprosedur {
    public static void siswa(String nama,int usia,String alamat){
        System.out.println("Nama "+nama+", Usia "+usia+" alamat "+alamat);
        
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama=input.nextLine();
        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan alamat: ");
        String alamat=input.nextLine();
        
        siswa(nama, usia, alamat);
        
    }
    
}
