package IT;

public class IT {

  public static void main(String[] args) {
   
   String [][] kontak = {
     {"budi", "\t     (*080#)"},
     {"beny", " \t    (0852#)"},
     {"bayu", "\t     (08361#)"},
     {"Alex", "\t     (112829#)"},
     {"kaco", " \t    (*123#)"},
     {"iccikopi ","\t(*5055#)"}
   };
   System.out.println("-----kontak tersimpan-----");
   for(int i = 0; i < kontak.length; i++){
     for(int j = 0; j < kontak[i].length; j++){
       System.out.print(kontak[i][j]);
     }
     System.out.println("");
   }
     
  }
}
