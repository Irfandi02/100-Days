package array;

import java.util.*;

public class array {

  public static void main(String[] args) {
  
  int [] arr = { 65, 80, 74, 89, 100 } ;
  int Max = arr[0];
  
  Arrays.sort(arr);
  for (int i = 0; i < arr.length - 1; i++){
    if( arr[i] > Max ){
      Max = arr[i];
    }
  }
   System.out.println(Max);
   
  }
}
