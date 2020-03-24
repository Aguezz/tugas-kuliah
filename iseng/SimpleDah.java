import java.util.Scanner;

class SimpleDah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan password anda : ");
        String password = in.nextLine();

        // Daftar karakter yang boleh dipakai
        String validChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // Variabel penentu apakah karakter pada password sesuai dengan karakter yang boleh dipakai
        boolean isValidPassword = true;

        // Variabel kemunculan angka
        // Variabel penentu apakah digit angka lebih dari dua atau tidak
        int totalNumberOccurrence = 0;

        // Melooping tiap karakter pada password
        for (int i = 0; i < password.length(); i++) {
            // Posisi karakter saat ini
            // Misal String password = "uinsa";
            // Isi currentChar ini bisa jadi u, i, n. s, atau a. Tergantung posisi index
            char currentChar = password.charAt(i);

            // Fungsi untuk memastikan apakah currentChar merupakan sebuah angka
            // Jika iya, maka variabel total kemunculan angka akan ditambah satu
            try {
                Integer.parseInt(String.valueOf(currentChar));
                totalNumberOccurrence++;
            } catch (NumberFormatException e) {}

            // Variabel penentu apakah karakter currentChar sama dengan karakter yang boleh dipakai
            boolean currentCharValid = false;

            // Melooping karakter yang boleh dipakai
            for (int j = 0; j < validChars.length(); j++) {
                // Posisi karakter saat ini
                // Isinya bakal a, b, c, ... A, B, C, ... 0. 1. 2 ...
                // Sesuai dengan karakter yg diperbolehkan
                char vChar = validChars.charAt(j);

                // Apakah currentChar saat ini sama dengan salah satu  karakter yg diperbolehkan
                if (currentChar == vChar) {
                    currentCharValid = true;
                    break;
                }
            }

            // Jika tidak sama, maka looping akan diberhentikan
            // Dan langsung mengeluarkan error
            if (!currentCharValid) {
                isValidPassword = false;
                break;
            }
        }

        // Apakah karakter password lebih dari sama dengan 10?
        // Apakah semua karakter pada String password sesuai dengan karakter yang diperbolehkan?
        // Apakah total kemunculan angka lebih dari sama dengan 2 kali muncul?
        if (password.length() >= 10 && isValidPassword && totalNumberOccurrence >= 2) {
            System.out.println("Kata sandi valid.");
        } else {
            System.out.println("Kata sandi tidak valid.");
        }
    }
}
