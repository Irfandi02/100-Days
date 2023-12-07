package mthdluas_kerucut;
import java.util.Scanner;
public class luaskerucut {
  public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   float  jari,tinggi,s;
   float  luasP,volume;
   System.out.println("Hitung luas & volume_kerucut dgn method");
   System.out.println("--------------");
   System.out.print("Nilai jari_jari :");
   jari = input.nextFloat();
   System.out.print("Nilai tinggi    :");
   tinggi = input.nextFloat();
   System.out.print("Nilai s         :");
   s = input.nextFloat();
   System.out.println("--------");
   System.out.println("Output :");
   luasP = luasP_kerucut(jari,s);
   System.out.println("Luas permukaan  :"+luasP);
   volume = volume_kerucut(jari,tinggi);
   System.out.println("Volume kerucut  :"+volume);
   
  }
  public static float luasP_kerucut(float r,float s){
    float phi = 3.14f;
    float hasil = phi * r * r *(r * s);
    return hasil;
  }
  public static float volume_kerucut(float r, float t){
    float phi = 3.14f;
    float hasil = 1/(float) 3 * phi * r * r * t;
    return hasil;
  }


}
