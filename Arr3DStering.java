package arr;
public class arr {
  public static void main(String[] args) {
  
  String[][][] arr = {
         {
         
           {"budi"},
           {"reski"},
           {"andi"},
           {"asep"},},
        
         {
         
           {"doni"},
           {"cinta"},
           {"Dewi"},
           {"adi"},},
     
         {
         
           {"Yusuf"},
           {"junaedi"},
           {"acok"},
           {"mifta"},},
    
  };
   
   for(int kelompok = 0; kelompok < arr.length; kelompok++) {
     System.out.println("=============]>");
     System.out.println("kelompok ke:"+ kelompok);
     for(int baris = 0; baris < arr[kelompok].length; baris++){
       for(int kolom = 0; kolom < arr[kelompok][baris].length; kolom++){
         System.out.print(arr[kelompok][baris][kolom] + " ");
       }
      
      System.out.println();
     }
     
   }
  }
}
