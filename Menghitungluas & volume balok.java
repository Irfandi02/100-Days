package menghitungluas;

import java.util.Scanner;

public class menghitungluas {

  public static void main(String[] args) {
   
   // kali ini kita akan menghitung luas dan volume balok
 
    Scanner UserInput = new Scanner(System.in); 
   
     float panjang,lebar,tinggi;
     float luasP,volume;
      System.out.println("\t Hitung luas permukaan & volume Balok \n\n ");
      
      System.out.print("masukkan panjang :");
      panjang = UserInput.nextFloat();
      
      System.out.print("masukkan lebar :");
      lebar = UserInput.nextFloat();
      
      System.out.print("masukkan tinggi :");
      tinggi = UserInput.nextFloat();
      
      
   luasP = 2* (panjang*lebar+lebar*tinggi*panjang*tinggi);
      System.out.println("\n luas permukaannya :" + luasP);
      
   volume = panjang*lebar*tinggi;
      System.out.println("Volume Baloknya :" + volume);
  }
}
