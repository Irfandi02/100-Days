package play;

public class play {

  // program prosedur_funsi
  
  //prosedur
  public static void hewan(){
    String nama = "ular";
    String jenis = "piton";
    System.out.println(nama+" jenis "+jenis);
    
  }
  
  //fungsi
  public static String tanaman(){
    String nama = "bunga";
    String jenis = "(bunga matahari)";
    return nama+"jenis"+jenis;
  }

  public static void main(String[] args) {
   hewan();
   System.out.print(tanaman());
  }
}
