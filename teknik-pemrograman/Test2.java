// import java.text.ParseException;
// import java.util.InputMismatchException;
import java.util.Scanner;

class Huruf {
    static Scanner input = new Scanner(System.in);

    static String characters = "adeoswr";
    static String numbers;
    static String result = "";

    public static void main(String[] args) {
        outerWhile: while (true) {
            result = "";
            System.out.print("\nMasukkan angka : ");
            String numbers = input.nextLine();

            if (numbers.length() <= 9) {
                for (int i = 0; i < numbers.length(); i++) {
                    try {
                        int number = Integer.parseInt(String.valueOf(numbers.charAt(i)));

                        if (number > characters.length()) {
                            System.out.print("Angka maksimal " + characters.length());
                            continue outerWhile;
                        }

                        result = result + characters.charAt(number - 1);
                    } catch (NumberFormatException e) {
                        System.out.print("Tidak boleh ada huruf!");
                        continue outerWhile;
                    }
                }

                break;
            } else {
                System.out.print("Maksimal 9 angka");
            }
        }

        System.out.println(result);
    }
}
