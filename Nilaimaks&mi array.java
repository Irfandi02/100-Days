package nilaimaksminarray;
import java.util.Arrays;
import java.util.Collections;

public class nilaimaksminarray {

  public static void main(String[] args) {
  
  // menghitung nilai maksimal dan minimal pada array
  
  Integer[] a = {25,66,74,99,55};
  int maks = Collections.max(Arrays.asList(a));
  int min = Collections.min(Arrays.asList(a));
  System.out.print("deret angka : ");
  for(int i = 0; i < a.length; i++){
    System.out.print(a[i]+" ");
    
  }
  System.out.println("");
  System.out.println("Nilai maks : "+ maks);
  System.out.println("Nilai min  : "+ min);
  }
}
