package day77;

import java.util.Scanner;

public class day77 {

  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Masukkan nilai x :");
  double x = input.nextDouble();
  System.out.print("Masukkan nilai y :");
  double y = input.nextDouble();
  double z = x/y;
  
  try{
    z = x / y;
    System.out.println("hasil ="+z);
  }catch (Exception e){
    System.out.println("pembagian salah");
  }
   
  }
}
