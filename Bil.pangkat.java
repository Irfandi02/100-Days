package pangkat;

import java.util.Scanner;

public class pangkat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        double bilangan = input.nextDouble();

        System.out.print("Masukkan pangkat: ");
        int pangkat = input.nextInt();

        double hasil =  Math.pow(bilangan, pangkat);

        System.out.println("Hasil dari " + bilangan + " pangkat " + pangkat + " adalah: " + hasil);
    }
