import java.text.DecimalFormat;

public class Anggur {
    public static void main(String[] args) {
        int n = 10;
        double anggur = 100.0;

        System.out.format("+----------+---------------+%n");
        System.out.format("| Hari ke  | Konsentrasi   |%n");
        System.out.format("+----------+---------------+%n");

        for (int i = 0; i < n; i++) {
            System.out.format(
                "| %-8s | %-13s |%n",
                i,
                new DecimalFormat("#.0000").format(anggur)
            );

            anggur = anggur * 9/10;
        }

        System.out.format("+----------+---------------+");
    }
}