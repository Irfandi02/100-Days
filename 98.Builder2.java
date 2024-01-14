package StringBuilder;

public class StringBuilder2 {

  public static void main(String[] args) {
 
        
        StringBuilder kata = new StringBuilder("Minggu");
        System.out.println("data = " +kata);
        System.out.println("panjang = " + kata.length());
        System.out.println("kapasitas = " + kata.capacity());
        //pemanggilan addressnya
        int addressBuilder = System.identityHashCode(kata);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
       
    }
}
  
   
  

