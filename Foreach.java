package foreach;

public class foreach {

  public static void main(String[] args) {
   
   int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};
   
   
   //looping standar
   System.out.println("-------------------------------");
   System.out.println("looping standar : ");
   System.out.println("-------------------------------");
   for(int i = 0; i < 10; i++){
     System.out.println("index ke-" + i + " adalah =" + arrayAngka[i]);
   }
   
   //looping dengan properti array
   System.out.println("-------------------------------");
   System.out.println("looping dengan properti length :");
   System.out.println("-------------------------------");
   for(int i = 0; i < arrayAngka.length; i++){
          System.out.println("index ke-" + i + " adalah =" + arrayAngka[i]);
   }
          
   //looping khusus
   System.out.println("-------------------------------");
   System.out.println("looping each :");
    System.out.println("-------------------------------");
   for(int angka : arrayAngka){
      System.out.println("angka pada looping ini =" + angka);
   }
  }
}
