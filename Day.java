import java.math.BigDecimal;
 
 public class Day9 {

  public static void main(String[] args) {
  
   // hari ini kita akan mempelajari BigDecimal
 
  //BigDecimal

   BigDecimal a1 = new BigDecimal("2.5");
   BigDecimal a2 = new BigDecimal("5.2");
   
  // penjumlahan
   BigDecimal sum = a1.add(a2);
   System.out.println("penjumlahan :" + sum);
   
  // pengurangan
  BigDecimal difference = a1.subtract(a2);
  System.out.println("pengurangan :" + difference);
  
  //perkalian
  BigDecimal product = a1.multiply(a2);
  System.out.println("perkalian :" + product);
  
  // pembagian
  BigDecimal division = a1.divide(a2,2,BigDecimal.ROUND_HALF_UP);
  System.out.println("pembagian :" + division);
   
  }
}
