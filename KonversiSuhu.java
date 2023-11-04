package SuhuConversi;

import java.util.Scanner;

public class SuhuConversi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("----------Pilih jenis konversi suhu ----------");
            System.out.println("1. Celsius ke Kelvin");
            System.out.println("2. Celsius ke Fahrenheit");
            System.out.println("3. Celsius ke Reamur");
            System.out.println("4. Kelvin ke Celsius");
            System.out.println("5. Kelvin ke Fahrenheit");
            System.out.println("6. Kelvin ke Reamur");
            System.out.println("7. Fahrenheit ke Celsius");
            System.out.println("8. Fahrenheit ke Kelvin");
            System.out.println("9. Fahrenheit ke Reamur");
            System.out.println("10. Reamur ke Celsius");
            System.out.println("11. Reamur ke Kelvin");
            System.out.println("12. Reamur ke Fahrenheit");
            System.out.println("0.keluar ");
            System.out.println("---------------------------------------------");
            System.out.print("masukkan pilihan :");
            int pilihan = input.nextInt();
            
            if (pilihan == 0) {
                break;
            }
            
            System.out.print("Masukkan suhu: ");
            double suhu = input.nextDouble();
            
            double hasil = 0;
            
            
            switch (pilihan) {
                case 1:
                    hasil = celsiusToKelvin(suhu);
                    break;
                case 2:
                    hasil = celsiusToFahrenheit(suhu);
                    break;
                case 3:
                    hasil = celsiusToReamur(suhu);
                    break;
                case 4:
                    hasil = kelvinToCelsius(suhu);
                    break;
                case 5:
                    hasil = kelvinToFahrenheit(suhu);
                    break;
                case 6:
                    hasil = kelvinToReamur(suhu);
                    break;
                case 7:
                    hasil = fahrenheitToCelsius(suhu);
                    break;
                case 8:
                    hasil = fahrenheitToKelvin(suhu);
                    break;
                case 9:
                    hasil = fahrenheitToReamur(suhu);
                    break;
                case 10:
                    hasil = reamurToCelsius(suhu);
                    break;
                case 11:
                    hasil = reamurToKelvin(suhu);
                    break;
                case 12:
                    hasil = reamurToFahrenheit(suhu);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            
            System.out.println("Hasil konversi: " + hasil);
            
            System.out.println("-------------------------------------------");
        }
        
        input.close();
        
    }
    
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15 ;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToReamur(double celsius) {
        return celsius * 4/5;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static double kelvinToReamur(double kelvin) {
        return (kelvin - 273.15) * 4/5;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double fahrenheitToReamur(double fahrenheit) {
        return (fahrenheit - 32) * 4/9;
    }

    public static double reamurToCelsius(double reamur) {
        return reamur * 5/4;
    }

    public static double reamurToKelvin(double reamur) {
        return (reamur * 5/4) + 273.15;
    }

    public static double reamurToFahrenheit(double reamur) {
        return (reamur * 9/4) + 32;
    }
}
