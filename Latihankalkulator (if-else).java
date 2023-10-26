package latihankalkulator;

import java.util.*;

public class latihankalkulator {

  public static void main(String[] args) {
   
   // latihan kalkulator sederhana menggunakan(if-else)
   
   Scanner inputUser;
   float a,b,hasil;
   char operator;
   
   inputUser = new Scanner(System.in);
   
   System.out.print("nilai a= ");
   a = inputUser.nextFloat();
   System.out.print("operator = ");
   operator = inputUser.next().charAt(0);
   System.out.print("nilai b= ");
   b = inputUser.nextFloat();
   
   System.out.println("input user:"+ a +""+operator+""+b);
   
   // operator yang tersedia : +,-,*,/
   
   if(operator == '+'){
       //penjumlahan
        hasil = a + b;
        System.out.println("hasil = " + hasil);
   }else if (operator == '-'){
       //pengurangan
       hasil = a - b;
       System.out.println("hasil = " + hasil);      
   }else if (operator == '*'){
       //perkalian
       hasil = a * b;
       System.out.println("hasil = " + hasil);
   }else if (operator == '/'){
       //pembagian
       if (b == 0 ){
         System.out.println("pembagian nol menghasilkan tak hingga");
       }else{
         hasil = a/b;
         System.out.println("hasil = " + hasil);
       }
   }else{
     System.out.println("operator tidak ditemukan");  
   }

  }
}
