// import java.text.ParseException;
// import java.util.InputMismatchException;
import java.util.Scanner;

class Huruf {
    Scanner input = new Scanner(System.in);

    String characters = "adeoswr";
    String numbers;
    String result = "";

    void setResult(String result) {
        this.result = result;
    }

    String getResult() {
        return this.result;
    }

    void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    String getNumbers() {
        return this.numbers;
    }

    String getCharacters() {
        return this.characters;
    }

    public static void main(String[] args) {
        clearScreen();
        Huruf h = new Huruf();

        outerWhile: while (true) {
            h.setResult("");
            System.out.print("\nMasukkan angka : ");
            String numbers = h.input.nextLine();

            if (numbers.length() <= 9) {
                for (int i = 0; i < numbers.length(); i++) {
                    try {
                        int number = Integer.parseInt(String.valueOf(numbers.charAt(i)));

                        if (number > h.getCharacters().length()) {
                            clearScreen();
                            System.out.print("Angka maksimal " + h.getCharacters().length());
                            continue outerWhile;
                        }

                        h.setResult(h.getResult() + h.getCharacters().charAt(number - 1));
                    } catch (NumberFormatException e) {
                        clearScreen();
                        System.out.print("Tidak boleh ada huruf!");
                        continue outerWhile;
                    }
                }

                break;
            } else {
                clearScreen();
                System.out.print("Maksimal 9 angka");
            }
        }

        System.out.println(h.getResult());
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J\n");
        System.out.flush();
    }
}