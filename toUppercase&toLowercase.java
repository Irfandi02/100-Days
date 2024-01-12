package kapitalkecil;
import java.util.Scanner;
public class kapitalkecil{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Untuk to.UpperCase mengubah huruf kapital atau kecil
        System.out.print("Masukkan kalimat : ");
        String kalimat = sc.nextLine();
        
        //toUpperCase untuk huruf Kapital
        System.out.println("toUpperCase : " + kalimat.toUpperCase());
        
        //toLowerCase untuk huruf kecil
        System.out.println("toLowerCase : " + kalimat.toLowerCase());
    }
 } 
