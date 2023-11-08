package codingan;
import java.util.Scanner;

 public class faktorial {

 public static void main(String[] args) {
  
  int angka;
  Scanner input = new Scanner(System.in);
  System.out.println("------------------------");
  System.out.println("-------FAKTORIAL--------");
  System.out.println("------------------------");
  System.out.print("Masukkan angka : ");
  angka = input.nextInt();
  System.out.println("----------");
  System.out.println("Output : ");
  int hasil = 1; 
  System.out.print(angka + "! = ");
  for(int i = angka; i > 0; i--) {
     System.out.print(i);
     if(i > 1){
       System.out.print(" x ");
     }
     hasil *= i;
  }
  System.out.println(" ");
  System.out.println("hasil = " + hasil);
  }
}
