import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;
import java.util.Locale;

class LabaRugi {
    private static Scanner input = new Scanner(System.in);

    private static int inputInt(String message) {
        int num;

        while (true) {
            System.out.println(message);
            try {
                num = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                LabaRugi.clearScreen();
                System.out.print("Format angka tidak valid!");
            }
        }

        return num;
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        LabaRugi.clearScreen();
        int omzet = 50000000;
        double pengeluaran;

        int gajiKaryawan = 1500000;
        int biayaOperasional = 160000; 
        double pajak = 1.5/100; 

        int jumlahKaryawan = inputInt("Jumlah karyawan :");
        int jumlahHari = inputInt("\nJumlah hari untuk biaya operasional :");

        int totalGajiKaryawan = gajiKaryawan * jumlahKaryawan;
        int totalBiayaOperasional = biayaOperasional * jumlahHari;

        double bulan = Math.ceil(jumlahHari / 30) + 1;

        double totalPajak = bulan * pajak * omzet;

        pengeluaran = totalGajiKaryawan + totalBiayaOperasional + totalPajak;

        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));

        System.out.println("\n---------------------------------------------");
        System.out.println("| Total gaji karyawan     : Rp " + nf.format(totalGajiKaryawan));
        System.out.println("| Total biaya operasional : Rp " + nf.format(totalBiayaOperasional));
        System.out.println("| Total pajak             : Rp " + nf.format(totalPajak));
        System.out.println("| Total Pengeluaran       : Rp " + nf.format((int) pengeluaran));
        System.out.println("| Hasil bersih            : Rp " + nf.format(omzet - ((int) pengeluaran)));
        System.out.println("---------------------------------------------");

        if (pengeluaran <= omzet * 7/10) {
            System.out.println("\nKesimpulan : Laba/untung");
        } else {
            System.out.println("\nKesimpulan : Rugi");
        }

        input.close();
    }
}