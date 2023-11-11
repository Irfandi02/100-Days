package menghitungrerata;
import java.util.Scanner;

public class menghitungrerata {

  public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   int jml;
   double nilai,total = 0,rata_rata;
   System.out.println("-----MENGHITUNG NILAI RATA-RATA-----");
   System.out.print("Masukkan Berapa Nilai :" );
   jml = input.nextInt();
   System.out.println("-----------------------");
   System.out.println("output :");
   for(int i = 1; i <= jml; i++){
     System.out.print("nilai ke-"+i+" =");
     nilai = input.nextDouble();
     total += nilai;
   }
   rata_rata = total/jml;
   System.out.println("Total     = "+total);
   System.out.println("Rata_rata = "+rata_rata);
   System.out.println("-------------------------");
  
  }
}

