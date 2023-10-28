package konversi;
import java.util.Scanner;
public class konversi {

  public static void main(String[] args) {
  //hari ini kita mempelajari konversi decimal ke biner
    Scanner masuk = new Scanner(System.in);
    int angka;
    
    System.out.println("masukkan sebuah bilangan desimal:");
    angka = masuk.nextInt();
    
     String biner = decimalToBinary(angka);
    System.out.println("Bilangan biner yang sesuai adalah : "+ biner);
   
  }
  public static String decimalToBinary(int nomor){
    if (nomor == 0){
       return "0";
    }
    
    else if(nomor == 1){
       return "1";
    }
    else {
       int remainder = nomor % 2;
       int quotIent = nomor / 2;
       return decimalToBinary(quotIent)+remainder;
    }
  }
  
}
