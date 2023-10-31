package DoWhile;
import java.util.Scanner;
public class DoWhile {

  public static void main(String[] args) {
   String nama,alamat,loop;
   do{
        Scanner input = new Scanner(System.in);
        System.out.print("nama : ");
        nama = input.nextLine();
        System.out.print("alamat : ");
        alamat = input.nextLine(); 
        System.out.println("---------------------------");                  
        System.out.println(nama+ " tinggal di " +alamat);
        System.out.print("ulang (y/n) :");
        loop = input.next();
 } while(loop.equals("y"));
     System.out.println("program selesai");
    
  }
}
