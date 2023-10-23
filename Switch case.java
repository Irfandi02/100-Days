package switchcase;
 
 import java.util.*;

public class switchcase {

  public static void main(String[] args) {
   
   // switch case

   String input;
   
   Scanner inputUser = new Scanner(System.in);
   System.out.println("panggil nama:");
   input = inputUser.next();
    switch (input) {
      case "irfandi":
         System.out.println("nama saya irfandi  hadir pak!!!");
    
      case "andi":
         System.out.println("nama saya andi hadir pak!!");
      break;
       default:
          System.out.println(input + "tidak hadir pak!!");
   
   }
    
    
   
   
  }
}
