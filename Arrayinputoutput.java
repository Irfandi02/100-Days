import java.util.Scanner;

public class coding {

  public static void main(String[] args) {
  
   // Array menggunakan inputan keyboard
   int jmlindex;
   Scanner input = new Scanner(System.in);
   System.out.print("jml index :");
   jmlindex = input.nextInt();
   int a[] = new int[jmlindex];
   System.out.println("input :");
   System.out.println(package"-----------");
   for (int i = 0; i < jmlindex; i++){
     System.out.print("index -"+i+" : ");
     a[i] = input.nextInt();
   }
   System.out.println("-----------");
   System.out.println("output:");
   for (int i = 0; i < jmlindex; i++){
     System.out.print(a[i]+ " ");
   }
  }
}

