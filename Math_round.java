package math_round;

public class mathround {

    public static void main(String[] args) {
        double originalNumber = 5.3;
        long roundedNumber = Math.round(originalNumber);
        int result = (int) roundedNumber;

        System.out.println("bilangan asli: " + originalNumber);
        System.out.println("bilangan yg dibulatkan: " + result);
    }
}
