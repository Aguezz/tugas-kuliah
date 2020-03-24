import java.util.Scanner;
import java.util.regex.Pattern;

class latihan6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Masukkan password : ");
            String password = scan.nextLine();

            if (password.length() >= 10) {
                if (Pattern.matches("^[0-9a-zA-Z]+$", password)) {
                    String numberOnly = password.replaceAll("[a-zA-Z]", "");

                    if (numberOnly.length() >= 2) {
                        System.out.println(password + " merupakan password yang valid.");
                        break;
                    } else {
                        System.out.println("\nPassword setidaknya mengandung dua digit angka saja!");
                    }
                } else {
                    System.out.println("\nPassword hanya boleh diisi huruf alfabet dan angka saja!");
                }
            } else {
                System.out.println("\nPassword setidaknya terdiri dari 10 karakter!");
            }
        }
    }
}
