import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

class Currentcy {
    String name;
    Double nominal;

    void init(String name_, Double nominal_) {
        name = name_;
        nominal = nominal_;
    }
}

class Convert {
    private static Scanner input = new Scanner(System.in);

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Convert.clearScreen();

        int money;
        Currentcy currentcy;

        Currentcy real = new Currentcy();
        Currentcy dollar = new Currentcy();
        real.init("Real", 3655.57);
        dollar.init("Dollar", 13651.74);
        System.out.println("Konversi Mata Uang");

        while (true) {
            System.out.println("------------------");
            System.out.println("[1] Dollar");
            System.out.println("[2] Real");
            System.out.println("------------------");
            System.out.println("Pilih konversi mata uang [1/2]:");

            String currentcyString = input.nextLine();

            if (currentcyString.equals("1")) {
                currentcy = dollar;
                break;
            } else if (currentcyString.equals("2")) {
                currentcy = real;
                break;
            } else {
                Convert.clearScreen();
                System.out.println("Format angka salah!");
            }
        }

        Convert.clearScreen();

        while (true) {
            System.out.println("Konversi ke " + currentcy.name);
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
        String prettyCurrentcy = nf.format(money / currentcy.nominal);

        System.out.println("Rp " + prettyRupiah + " dalam " + currentcy.name + " adalah‎ " + prettyCurrentcy + " " + currentcy.name);

        input.close();
    }
}
