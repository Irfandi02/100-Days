package GGmethod;

import java.util.Scanner;


public class GGmethod {

  public static void main(String[] args) {
  
  // Hari ini kita akan membuat program yang menampilkan         
  //  ganjil genap menggunakan method

    Scanner input = new Scanner (System.in);
    
    System.out.print("Masukan Bilangan :");
    int bilangan = input.nextInt();
    GanjilGenap(bilangan);
   
  }
   public static void GanjilGenap (int bilangan) {
     if (bilangan % 2 == 1){
     System.out.println("---------------------");
     System.out.println("Output :");
       System.out.print(bilangan+ " Bilangan Ini Adalah Ganjil :");
     }else{
       System.out.print(bilangan+" Bilangan Ini Adalah Genap :");
     }
   }


}
