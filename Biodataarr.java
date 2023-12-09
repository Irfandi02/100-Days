package Biodata;
public class Biodata {
    public static void main(String[] args) {
    
    //array menggunakan for ech
        String[][][] biodata = {
                {
                        {"Nama: Irfandi"},
                        {"NIM: D0223318"},
                        {"Kelas: B Informatika"},
                        {"Alamat: Mateng"}
                }
        };

        // Menampilkan biodata
        System.out.println("Biodata:");
        System.out.println("--------");
        for (String[][] data1 : biodata) {
            for (String[] data2 : data1) {
                for (String data : data2) {
                    System.out.println(data);
                }
            }
        }
    }
}


