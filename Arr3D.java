package arr;

public class arr {

  public static void main(String[] args) {
  
  int[][][] arr = {
         {
         
           {7,10,11,17},
           {5,12,43,98},
           {8,9,6,88,4},},//layer1
        
         {
         
           {44, 32, 28, 27},
           {72, 18, 16, 19},
           {92, 12, 11, 26},},//layer2
     
         {
         
           {23,21,22,13},
           {77,12,45,98},
           {13,31,54,99},},//layer3
    
  };
   
   for(int layer = 0; layer < arr.length; layer++) {
     System.out.println("==========");
     System.out.println("layer ke:"+ layer);
     for(int baris = 0; baris < arr[layer].length; baris++){
       for(int kolom = 0; kolom < arr[layer][baris].length; kolom++){
         System.out.print(arr[layer][baris][kolom] + " ");
       }
      
      System.out.println();
     }
     
   }
  }
}
