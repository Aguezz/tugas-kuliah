import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

class Convert {
    private static Scanner input = new Scanner(System.in);

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(final String[] args) {
        Convert.clearScreen();

        int money;
        final double riyal = 3651.53;
        System.out.println("Konversi Rupiah ke Riyal");

        while (true) {
            System.out.println("Masukkan jumlah nominal uang dalam rupiah :");

            String moneyString = input.nextLine();

            try {
                money = Integer.parseInt(moneyString);

                if (money <= 0) {
                    Convert.clearScreen();
                    System.out.println("Angka yang diinputkan minimal 0");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("\nFormat angka salah!");
                System.out.println("Coba lagi [y/n] :");
                String retry = input.nextLine();

                System.out.print(retry);

                if (!retry.equals("y")) {
                    input.close();
                    return;
                }

                Convert.clearScreen();
            }
        }

        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));
        String prettyRupiah = nf.format(money);
        String prettyRiyal = nf.format((int) (money / riyal));

        System.out.format("\nRp %s dalam Riyal adalah‎ %s Riyal\n", prettyRupiah, prettyRiyal);

        input.close();
    }
}
