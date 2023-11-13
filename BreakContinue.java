package breakcontinue;

public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("Penggunaan break dan continue:");

        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break; // Keluar dari loop jika i sama dengan 7
            }

            System.out.print(i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                continue; // Melanjutkan ke iterasi berikutnya jika i sama dengan 7
            }

            System.out.print(i);
        }
    }
}
