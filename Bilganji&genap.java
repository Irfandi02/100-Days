package task;

import java.util.Scanner;

public class task {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("masukkan angka bilangan ganjil:");
    int bilangan = input.nextInt();
    System.out.println("------------");
    System.out.println("output :");

    if (bilangan % 2 == 1) {
      for (int i = 1; i <= bilangan; i += 2) {
        System.out.println(i);
      }
    } else if(bilangan %2 == 0){
      System.out.println("maaf bilangan yang anda masukkan bilangan genap!!");
    }

  }
}
