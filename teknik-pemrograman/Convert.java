import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

class Currency {
    int id;
    String name;
    double value;

    Currency(int _id, String _name, double _value) {
        id = _id;
        name = _name;
        value = _value;
    }
}

class Convert {
    private static Scanner input = new Scanner(System.in);

    static void clearScreen() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Convert.clearScreen();

        Currency currencies[] = new Currency[3];
        currencies[0] = new Currency(1, "Dollar", 13693.75);
        currencies[1] = new Currency(2, "Riyal", 3651.53);
        currencies[2] = new Currency(3, "Euro", 14831.50);

        int rupiah;
        Currency currencySelected;

        System.out.println("Konversi Mata Uang");

        outerLoop: {
            while (true) {
                System.out.println("------------------");
                for (Currency currency : currencies) {
                    System.out.format("[%d] %s\n", currency.id, currency.name);
                }
                System.out.println("------------------");
                System.out.println("Pilih tujuan konversi [1/2]:");

                String currencyIdString = input.nextLine();

                try {
                    int currencyId = Integer.parseInt(currencyIdString);

                    if (currencyId > currencies.length || currencyId <= 0) {
                        Convert.clearScreen();
                        System.out.println("Format angka salah!");
                    } else {
                        for (Currency currency : currencies) {
                            if (currency.id == currencyId) {
                                currencySelected = currency;
                                break outerLoop;
                            }
                        }
                    }
                } catch (NumberFormatException e) {
                    Convert.clearScreen();
                    System.out.println("Format angka tidak valid!");
                }
            }
        }

        Convert.clearScreen();

        while (true) {
            System.out.println("Masukkan jumlah nominal uang dalam rupiah :");

            String rupiahString = input.nextLine();

            try {
                rupiah = Integer.parseInt(rupiahString);

                if (rupiah <= 0) {
                    Convert.clearScreen();
                    System.out.println("Angka yang diinputkan minimal 0");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                Convert.clearScreen();
                System.out.println("\nFormat angka salah!");
            }
        }

        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));
        String prettyRupiah = nf.format(rupiah);
        String prettyRiyal = nf.format(rupiah / currencySelected.value);

        System.out.format("\nRp %s dalam %s adalah‎ %s\n", prettyRupiah, currencySelected.name, prettyRiyal);

        input.close();
    }
}
