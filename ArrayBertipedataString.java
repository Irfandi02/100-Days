package NonPrimitifArray;

import java.util.ArrayList;

public class NonPrimitifArray {
    public static void main(String[] args) {
   // Mendeklarasikan ArrayList untuk menyimpan data non-primitif (contoh menggunakan string)
        
        ArrayList<String> daftarNama = new ArrayList<>();
        
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Aco");
        daftarNama.add("reski");

        
        System.out.println("Daftar Nama:");
        for (String nama : daftarNama) {
            System.out.println(nama);
        }
    }
}
