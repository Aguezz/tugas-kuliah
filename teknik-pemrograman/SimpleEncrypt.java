import java.util.Scanner;

class SimpleEncrypt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        String input = scan.nextLine();

        if (input.length() < 10 && input.length() > 0) {
            String hasil = "";

            for (int i = 0; i < input.length(); i++) {
                String number = String.valueOf(input.charAt(i)); // Untuk mengambil satu digit angka setiap index

                if (Integer.parseInt(number) > 7) {
                    System.out.println("Angka maksimal 7");
                    break;
                }

                if (number.equals("1")) hasil += "a";
                else if (number.equals("2")) hasil += "d";
                else if (number.equals("3")) hasil += "e";
                else if (number.equals("4")) hasil += "o";
                else if (number.equals("5")) hasil += "s";
                else if (number.equals("6")) hasil += "w";
                else if (number.equals("7")) hasil += "r";
            }

            System.out.println(hasil);
        } else {
            System.out.println("Angka yang dimasukkan minimal 1 karakter dan maksimal 9 karakter");
        }
    }
}
