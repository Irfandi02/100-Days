package treshet;

import java.util.*;

public class treeset {

  public static void main(String[] args) {
  
  TreeSet<String> A = new TreeSet<String>();
        
        A.add("adi"); A.add("andi"); A.add("doni");
        
        Iterator<String> iterator = A.iterator();
        
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
   
  

