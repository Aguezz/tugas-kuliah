import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

class LabaRugi {
    private static Scanner input = new Scanner(System.in);

    private static int inputInt(String message) {
        int num;

        while (true) {
            System.out.println(message);
            String numString = input.nextLine();
            try {
                num = Integer.parseInt(numString);

                if (num > 0) {
                    break;
                } else {
                    LabaRugi.clearScreen();
                    System.out.println("Angka yang diinputkan minimal 0!");
                }
            } catch (NumberFormatException e) {
                LabaRugi.clearScreen();
                System.out.println("Format angka tidak valid!");
            }
        }

        return num;
    }

    static void clearScreen() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        LabaRugi.clearScreen();
        
        int omzet = 50000000;
        double omzetHarian = omzet / 30;
        int gajiKaryawan = 1500000;
        double gajiKaryawanHarian = gajiKaryawan / 30;
        int biayaOperasionalHarian = 160000;
        double pajak = 1.5 / 100;
        double pajakHarian = omzet * pajak / 30;

        int jumlahKaryawan = inputInt("Jumlah karyawan :");
        int jumlahHari = inputInt("\nJumlah hari untuk biaya operasional :");

        double totalOmzet = omzetHarian * jumlahHari;
        totalOmzet = jumlahHari % 30 == 0 ? Math.ceil(jumlahHari/30) * omzet : totalOmzet;

        double totalGajiKaryawan = gajiKaryawanHarian * jumlahHari * jumlahKaryawan;
        double totalBiayaOperasional = biayaOperasionalHarian * jumlahHari;

        double totalPajak = pajakHarian * jumlahHari;

        double pengeluaran = totalGajiKaryawan + totalBiayaOperasional + totalPajak;

        double penghasilanBersih = totalOmzet - pengeluaran;

        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));

        System.out.println("\n---------------------------------------------");
        System.out.println("| Omzet/hari              : Rp " + nf.format(omzetHarian));
        System.out.println("| Omzet/bulan             : Rp " + nf.format(omzet));
        System.out.println("|\n| Gaji karyawan/hari      : Rp " + nf.format(gajiKaryawanHarian));
        System.out.println("| Gaji karyawan/bulan     : Rp " + nf.format(gajiKaryawan));
        System.out.println("|\n| Biaya operasional/hari  : Rp " + nf.format(biayaOperasionalHarian));
        System.out.println("| Biaya operasional/bulan : Rp " + nf.format(biayaOperasionalHarian * 30));
        System.out.println("|\n| Pajak/hari              : Rp " + nf.format(pajakHarian));
        System.out.println("| Pajak/bulan             : Rp " + nf.format(pajakHarian * 30));
        System.out.println("---------------------------------------------");
        System.out.println("| Total omzet             : Rp " + nf.format(totalOmzet));
        System.out.println("| Total gaji karyawan     : Rp " + nf.format(totalGajiKaryawan));
        System.out.println("| Total biaya operasional : Rp " + nf.format(totalBiayaOperasional));
        System.out.println("| Total pajak             : Rp " + nf.format(totalPajak));
        System.out.println("| Total pengeluaran       : Rp " + nf.format((int) pengeluaran));
        System.out.println("|\n| Penghasilan bersih      : Rp " + nf.format(penghasilanBersih));
        System.out.println("---------------------------------------------");

        if (pengeluaran <= totalOmzet * 7 / 10) {
            System.out.println("\nKesimpulan : Laba/untung");
        } else {
            System.out.println("\nKesimpulan : Rugi");
        }

        input.close();
    }
}
