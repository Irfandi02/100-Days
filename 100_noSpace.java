package string;

public class string {

  public static void main(String[] args) {
  System.out.println(noSpace("pada hari Senin malam saya nonton bola"));
        System.out.println(noSpace("liat Indonesia lawan irak"));
        System.out.println(noSpace("namun pada akhirnya indonesia kalah sakit bet!!    "));
    }

    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }
}
   
  

