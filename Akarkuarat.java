import java.util.Scanner;

public class AkarKuadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan bilangan untuk dihitung akar kuadratnya: ");
        double bilangan = scanner.nextDouble();

        // Menentukan akar kuadrat menggunakan Math.sqrt()
        double akarKuadrat = Math.sqrt(bilangan);

        System.out.println("Akar kuadrat dari " + bilangan + " adalah: " + akarKuadrat);

        scanner.close();
    }
