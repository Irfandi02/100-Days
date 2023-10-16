package Day8;

import java.math.BigInteger;
import java.util.Scanner;

public class Day8 {

  public static void main(String[] args) {
   
   // BigInteger
    
    String s;
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    
    BigInteger one = new BigInteger (s1);
    BigInteger two = new BigInteger (s2);
    System.out.println(one);
    System.out.println(two);
    System.out.println(two.bitCount());
    
    
  }
}
