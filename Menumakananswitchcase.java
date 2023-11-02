package menumakananswitchcase;
import java.util.Scanner;

public class menumakananswitchcase {

  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int pil,porsi,harga = 0;
   System.out.println("==========MENU MAKANAN==========");
   System.out.println("1.Bakso\n2.Mie ayam\n3.sop ayam");
   System.out.println("=================================");
   System.out.print("Pilih :");
   pil = input.nextInt();
   switch (pil) {
     case 1:
       System.out.print("Porsi :");
       porsi = input.nextInt();
       System.out.println("Bakso (10k/porsi)");
       harga = 10000 * porsi;
       break;
     case 2:
       System.out.print("Porsi :");
       porsi = input.nextInt();
       System.out.println("Mie ayam(9k/porsi)");
       harga = 9000 * porsi;
       break;
     case 3:
       System.out.print("Porsi :");
       porsi = input.nextInt();
       System.out.println("Sop ayam(11k/porsi)");
       harga = 11000 * porsi;
       break;
     default:
        System.out.println("pilihan salah");
        break;
      
   }
   System.out.println("Total :Rp." +harga);

  }
}
