package tabung;
import java.util.Scanner;
public class tabung {

  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   float phi = 3.14f;
   float r,luasP,tinggi,volume;
   
   System.out.println("menghitung luas & volume tabung");
   System.out.println("--------------------------");
   
   System.out.print("\tmasukkan nilai jari_jari :");
   r = input.nextFloat();
  
   System.out.print("\tmasukkan nilai tinggi  :");
   tinggi = input.nextFloat();
   
   luasP = 2 * phi * r * (r * tinggi);
   System.out.println("\tLuas permukaannya    :"+ luasP);
   
   volume = phi * r * r * tinggi;
   System.out.println("\tVolume tabungnya     : "+ volume) ;
   
   
  }
}
