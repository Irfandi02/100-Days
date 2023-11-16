package Array;

public class Array {
    public static void main(String[] args) {
    
    // Deklarasi array bertipe data primitif
    
    // array bertipe data int
    int[] intArray = new int[5];
    intArray[0] = 99;
    intArray[1] = 85;
    intArray[2] = 78;
    intArray[3] = 70;
    intArray[4] = 65;
    
     System.out.println(" Array bertipe data integer :");
     System.out.println("----------------------------");
    for(int i = 0; i < intArray.length; i++){
        System.out.println("Nilai array ke - " + i + " = " + intArray[i] + " ");
       
    }
     System.out.println("----------------------------");
    
    
    // array bertipe data Double
    double[] doubleArray = new double[5];
    doubleArray[0] = 2.0;
    doubleArray[1] = 80.5;
    doubleArray[2] = 30.5;
    doubleArray[3] = 25.5;
    doubleArray[4] = 20.5;
     
     System.out.println(" Array bertipe data double :");
     
    for(int i = 0; i < doubleArray.length; i++){
        System.out.println("Nilai array ke - " + i + " = " + doubleArray[i] + " ");
 
    }
     System.out.println("---------------------------");
 
    
    // array bertipe data long
    long[] longArray = new long[5];
    longArray[0] = 1000000L;
    longArray[1] = 2000000L;
    longArray[2] = 3000000L;
    longArray[3] = 4000000L;
    longArray[4] = 5000000L;
    
     System.out.println("Array bertipe data Long :");
     
    for(int i = 0; i < longArray.length; i++){
        System.out.println("Nilai array ke - " + i + " = " + longArray[i] + " ");
    }
     System.out.println("------------------------------");
    }
}
