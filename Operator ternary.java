package operatorternary;

 import java.util.*;
public class operatorternary {

  public static void main(String[] args) {
    
     Scanner inputUser = new Scanner(System.in);
    
   // ternary operator
     int input, a;
   System.out.println("masukkan nilai:");
    input = inputUser.nextInt();
    a = (input == 10 ) ? (input*input) : (input/2);
    
    System.out.println("hasilnya " + a);
    
   
  
  }
}

