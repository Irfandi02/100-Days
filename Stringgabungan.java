package stringgabungan;
  import java.util.Scanner;
import java.lang.String;
public class stringgabungan {
public static void main(String[] args) {
        String kalimat = "Hari ini adalah hari";
        
        System.out.println(kalimat.charAt(15));
      
        String kata = kalimat.substring(5,20);
        System.out.println(kata);
        
        String kalimat2 = kata + " rabu";
        System.out.println(kalimat2);
    }
    
}
