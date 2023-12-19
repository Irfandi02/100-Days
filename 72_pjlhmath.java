package penjumlahan;

public class penjumlahan {

  public static void main(String[] args) {
  
  long nilaiA = 45000;
  long nilaiB = 55000;
  
  long x = Math.addExact(nilaiA, nilaiB);
  System.out.println("hasil :");
    System.out.println(+nilaiA+" + "+nilaiB+" = "+x);
   
  }
}
