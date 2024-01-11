package stringkomponen;
import java.lang.String;
public class komponenstring {
    public static void main(String[] args) {
        
        String kalimat = "vaforit saya bermain sepakbola ";
        
        System.out.println(kalimat.charAt(5));
        
        String kata = kalimat.substring(8,30);
        System.out.print(kata);
    }
}
