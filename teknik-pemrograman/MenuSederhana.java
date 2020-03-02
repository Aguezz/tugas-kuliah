import java.util.Scanner;

public class MenuSederhana {
    private static Scanner input = new Scanner(System.in);

    static void print() {
        System.out.println("---------------------");
        System.out.println("Menu Sederhana");
        System.out.println("---------------------");
        System.out.println("[1] Nama Diri");
        System.out.println("[2] Hobi Diri");
        System.out.println("[3] Makanan Favorit");
        System.out.println("[4] Keluar");
        System.out.print("Masukkan nomor pilihan Anda (1-4) : ");
    }

    public static void main(String[] args) {
        String nama = "";
        String hobi = "";
        String makanan = "";

        while (true) {
            print();
            String pilihan = input.nextLine();

            if (pilihan.equals("1") || pilihan.equals("2") || pilihan.equals("3") || pilihan.equals("4")) {
                if (pilihan.equals("1")) {
                    System.out.println("\nIni menu no. " + pilihan);
                    System.out.print("Nama saya : ");
                    nama = input.nextLine();

                } else if (pilihan.equals("2")) {
                    System.out.println("\nIni menu no. " + pilihan);
                    System.out.print("Hobi saya : ");
                    hobi = input.nextLine();

                } else if (pilihan.equals("3")) {
                    System.out.println("\nIni menu no. " + pilihan);
                    System.out.print("Makanan favorit saya : ");
                    makanan = input.nextLine();

                } else if (pilihan.equals("4")) {
                    break;

                }

                System.out.println("\n\n");
            } else {
                System.out.println("\n\nAngka yang anda masukkan salah!");
            }
        }

        System.out.println("-------------------------------");
        System.out.println("Nama            : " + nama);
        System.out.println("Hobi            : " + hobi);
        System.out.println("Makanan favorit : " + makanan);
        System.out.println("-------------------------------\n");
    }
}
