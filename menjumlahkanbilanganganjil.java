package Jmlbilanganganjil;
import java.util.Scanner;

public class Jmlbilanganganjil {

  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Masukan batas bilangan :");
   int bilangan = input.nextInt();
   int angka = 1;
   int jml = 0;
   for(int i = 1; i<=bilangan; i++){
       if(angka != 1){
       System.out.print("+"); 
    
      }
      System.out.print(angka);
      jml += angka;
      angka += 2;
   }
   System.out.print(" = "+ jml);
 
  }
}
