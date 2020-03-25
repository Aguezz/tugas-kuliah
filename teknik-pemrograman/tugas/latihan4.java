import java.util.Scanner;

/**
 * @author Agus Stiawan - H96219038
 */

class latihan4 {
    static Scanner scan = new Scanner(System.in);

    int saldo = 100000;

    void print() {
        System.out.println("\nMenu ATM");

        System.out.println("[1] Cek saldo");
        System.out.println("[2] Simpan uang");
        System.out.println("[3] Ambil uang");
        System.out.println("[4] Keluar");
    }

    void select(String menu) {
        System.out.println();

        if (menu.equals("1")) {
        } else if (menu.equals("2")) {
            System.out.print("Jumlah uang yang anda simpan Rp: ");
            int money = Integer.parseInt(scan.nextLine());

            this.saldo = this.saldo + money;
        } else if (menu.equals("3")) {
            System.out.print("Jumlah uang yang anda ambil Rp: ");
            int money = Integer.parseInt(scan.nextLine());

            this.saldo = this.saldo - money;
        } else if (menu.equals("4")) {
            System.exit(1);
        } else {
            System.out.println("Menu yang anda masukkan salah!");
            return;
        }

        System.out.println("Saldo anda adalah Rp " + this.saldo);
    }

    public static void main(String[] args) {
        latihan4 l = new latihan4();
        while (true) {
            l.print();

            System.out.println("Pilih Menu : ");
            String menu = scan.nextLine();

            l.select(menu);
        }
    }
}
