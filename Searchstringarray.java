package array;

import java.util.Scanner;

public class Array {

  public static void main(String[] args) {
  
  // mencari data menggunakan string pada array

   Scanner input = new Scanner(System.in);
   String [] a = {
      "kopi susu",
      "kopi batte",
      "teh",
      "susu",
      "sara,ba",
      "susu"   
   };
   String cari;
   int _search = 0;
   for(int i = 0; i < a.length; i++){
      System.out.println((i+1)+"."+a[i]);
   }
   System.out.println("-----------");
   System.out.print("Cari : ");
   cari = input.nextLine();
   for(int i = 0; i < a.length; i++){
      if(cari.equalsIgnoreCase(a[i])){
        System.out.println("Ada Di Nomor => "+(i+1));
       _search++;
     }  
   }
   if(_search == 0){
     System.out.println("tidak ada !!!");
   }
 
  }
}
