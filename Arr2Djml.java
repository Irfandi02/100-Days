package array;

public class array {

  public static void main(String[] args) {
    int [][] arr = {
      {25,8,52,10},
      {50,20,10,20},
      {8,9,56,30,}
    };
    int jumlah = 0;
    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr[i].length; j++){
        System.out.print(arr[i][j]+ " ");
        jumlah += arr[i][j];
      }
      System.out.println(" ");
    }
    System.out.println("-------------");
    System.out.println("Hasilnya penjumlahan adalah :"+jumlah);
   
  }
} 
