import java.text.DecimalFormat;
import java.util.Scanner;

public class Anggur {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah hari : ");
        int n = input.nextInt();
        double anggur = 100.0;

        System.out.format("+----------+---------------+%n");
        System.out.format("| Hari ke  | Konsentrasi   |%n");
        System.out.format("+----------+---------------+%n");

        for (int i = 0; i <= n; i++) {
            System.out.format(
                "| %-8s | %-13s |%n",
                i,
                (anggur < 1 ? "0" : "") + new DecimalFormat("#.0000").format(anggur)
            );

            anggur = anggur * 9/10;
        }

        System.out.format("+----------+---------------+\n");
    }
}