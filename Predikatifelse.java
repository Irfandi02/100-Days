package predikatifelse;
import java.util.Scanner;

public class predikatifelse {

  public static void main(String[] args) {
      int nilai;
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan Nilai :");
      nilai = input.nextInt();
      String predikat = null;
      if(nilai > 100){
          predikat = "Nilai Overload";
      }else if(nilai >= 85){
          predikat = "Amat Baik";
      }else if(nilai >= 75){
          predikat = "Baik";
      }else if(nilai >= 60){
          predikat = "Cukup";
      }else if(nilai < 60){
          predikat = "Kurang";
      }
      
      System.out.println("===========================");
      System.out.println("----------OUTPUT----------");
      System.out.println("===========================");
      System.out.println("Nilai \t\t = " +nilai);
      System.out.println("Predikat \t= " +predikat);
      
      
  }
}
