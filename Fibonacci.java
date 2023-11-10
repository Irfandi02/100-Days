package Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Ganti nilai n sesuai dengan jumlah angka Fibonacci yang ingin Anda hitung
        int[] fibonacciSeries = new int[n];
        
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }
        
        System.out.println("Deret Fibonacci dengan " + n + " angka pertama:");
        System.out.println("--------------------------");
        System.out.println("Output :");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries[i] + " ");
        }
    } 
         
}
