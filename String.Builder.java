package stringbuilder;

public class StringBuilder {

  public static void main(String[] args) {
  
  java.lang.StringBuilder stringBuilder = new java.lang. StringBuilder();

        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("World!");

        
        String result = stringBuilder.toString();

        System.out.println(result);
    }
}
   
