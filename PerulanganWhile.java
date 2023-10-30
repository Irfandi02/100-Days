package PerulanganWhile;
import java.util.Scanner;

public class PerulanganWhile {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int awal,akhir;
    System.out.println(" Bilangan Genap ");
    System.out.println("Awal :");
    awal = input.nextInt();
    System.out.println("Akhir :");
    akhir = input.nextInt();
    int a = awal;
    int split = 0;
    while(a <= akhir){
      int hasil = a % 2;
      if(hasil == 0){
        System.out.print(a + " ");
        split++;
        if(split == 5){
          System.out.println("");
          split = 0;
          
        }
         
      }
       a++;
    }
     System.out.println("");
  }
}
