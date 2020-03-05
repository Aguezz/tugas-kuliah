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
    static int rupiah;
    static Scanner input = new Scanner(System.in);
    static Currency currencySelected;
    static Currency[] currencies = {
        new Currency(1, "Dollar", 13693.75),
        new Currency(2, "Riyal", 3651.53),
        new Currency(3, "Euro", 14831.50),
    };

    static void clearScreen() {
        System.out.print("\033[H\033[2J\n");
        System.out.flush();
    }

    void selectCurrency() {
        clearScreen();
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
                        clearScreen();
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
                    clearScreen();
                    System.out.println("Format angka tidak valid!");
                }
            }
        }
    }

    void inputRupiah() {
        clearScreen();

        while (true) {
            System.out.println("Masukkan jumlah nominal uang dalam rupiah :");

            String rupiahString = input.nextLine();

            try {
                rupiah = Integer.parseInt(rupiahString);

                if (rupiah <= 0) {
                    clearScreen();
                    System.out.println("Angka yang diinputkan minimal 0");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                clearScreen();
                System.out.println("\nFormat angka salah!");
            }
        }
    }

    void hitung() {
        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));
        String prettyRupiah = nf.format(rupiah);
        String prettyRiyal = nf.format(rupiah / currencySelected.value);

        System.out.format("\nRp %s dalam %s adalah‎ %s\n", prettyRupiah, currencySelected.name, prettyRiyal);

        input.close();
    }

    public static void main(String[] args) {
        Convert c = new Convert();

        c.selectCurrency();
        c.inputRupiah();
        c.hitung();
    }
}
