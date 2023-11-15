package codin;

public class codin {

  public static void main(String[] args) {
   
   // contoh loop break menggunakan label untuk keluar dari loop
      
      outerloop : for (int i = 1; i<= 5; i++ ){
                  for(int j = 1; j <= 3; j++){
                    
              System.out.println("i ="+i+" j ="+j);
              
              
   //misalkan kita ingin keluar dari kedua loop jika j == 5
        if ( j == 5){
          break outerloop;
        }
                  }
      }
                  
  }
}
