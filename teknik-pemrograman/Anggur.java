import java.text.DecimalFormat;
import java.util.Scanner;

public class Anggur {
    double grape;
    int day;

    void setDay(int day) {
        this.day = day;
    }

    int getDay() {
        return this.day;
    }

    void setGrape(double grape) {
        this.grape = grape;
    }

    double getGrape() {
        return this.grape;
    }

    void showTable() {
        System.out.format("+----------+---------------+\n");
        System.out.format("| Hari ke  | Konsentrasi   |\n");
        System.out.format("+----------+---------------+\n");

        for (int i = 0; i <= this.getDay(); i++) {
            String prettyGrape = (this.getGrape() < 1 ? "0" : "") + new DecimalFormat("#.0000").format(this.getGrape());
            System.out.format("| %-8s | %-13s |\n", i, prettyGrape);

            this.setGrape(this.getGrape() * 9 / 10);
        }

        System.out.format("+----------+---------------+\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Anggur a = new Anggur();

        System.out.print("Masukkan jumlah hari : ");
        int day = input.nextInt();

        a.setGrape(100.0);
        a.setDay(day);
        a.showTable();

        input.close();
    }
}
