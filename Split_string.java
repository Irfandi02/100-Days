public class splitstring{

    public static void main(String[] args) {
        String tglLahir = "11 November 2005";
        String [] split = tglLahir.split(" ");
        String tgl = split[0];
        String bln = split[1];
        String thn = split[2];
        
        System.out.println("Tanggal\t: "+tgl);
        System.out.println("Bulan\t: "+bln);
        System.out.println("Tahun\t: "+thn);
        System.out.println("\n["+tglLahir+"]");
  
        
    }
}
