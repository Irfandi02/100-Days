package fktorial;

import java.util.Scanner;

public class fktorial {

  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  System.out.print("Masukkan bilangan :");
  int a = input.nextInt();
  System.out.print("Faktorisasi Prima "+ a +" Adalah :");
  for (int i = 2; i <= a; i++){
    while(a % i == 0 ){
      System.out.print(i +" ");
      a /= i;
    }
  }
  System.out.println(" ");
  }
}
