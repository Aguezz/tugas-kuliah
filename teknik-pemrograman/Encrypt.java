import java.util.Scanner;

class Encrypt {
    String chars = "adeoswr";

    String getChars() {
        return this.chars;
    }

    String validate(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            try {
                int number = Integer.parseInt(String.valueOf(input.charAt(i)));

                if (number < 1 || number > this.getChars().length()) {
                    clearConsole();
                    return "Angka tidak boleh kurang dari 0 dan tidak boleh lebih dari " + this.getChars().length();
                }

                result = result + this.getChars().charAt(number - 1);
            } catch (NumberFormatException ex) {
                clearConsole();
                return "Angka tidak boleh kurang dari 0 dan tidak boleh lebih dari " + this.getChars().length();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        clearConsole();
        Scanner scan = new Scanner(System.in);
        Encrypt e = new Encrypt();

        String result = "";

        while (true) {
            System.out.print("Masukkan angka : ");
            String input = scan.nextLine();

            if (input.length() < 10 && input.length() > 0) {
                result = e.validate(input);

                if (result.length() == input.length()) {
                    break;
                } else {
                    clearConsole();
                    System.out.println(result);
                }
            } else {
                clearConsole();
                System.out.println("Jumlah karakter tidak boleh kurang dari 1 dan tidak boleh lebih dari 9 karakter");
            }
        }

        System.out.println(result);

        scan.close();
    }

    static void clearConsole() {
        System.out.print("\033[H\033[2J\n");
        System.out.flush();
    }
}
