package PolaSegiEmpat;

public class PolaSegiEmpat {
    public static void main(String[] args) {
    // hari ini kita akan membuat program polapersegi
        int tinggi = 5; 

        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < tinggi; j++) {
                if (i == 0 || i == tinggi - 1 || j == 0 || j == tinggi - 1) {
                    System.out.print("$");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
