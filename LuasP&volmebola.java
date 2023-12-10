package luasbola;
import java.util.Scanner;
public class luasbola {
  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  
  float phi = 3.14f;
  float  r,luasP,volume;
  
  System.out.println("Menghitung luas permukaan & volume bola ");
  System.out.println("--------------------------");
  
  System.out.print("Masukan jari_jari bola :");
  r = input.nextFloat();
  
  luasP = 4 * phi * r * r;
  System.out.println("Luas permukaannya :"+ luasP);
   
  volume = 4 /(float)3 * r * r * r;
  System.out.print("Volume Bolanya    :"+ volume);
  
  }
}
