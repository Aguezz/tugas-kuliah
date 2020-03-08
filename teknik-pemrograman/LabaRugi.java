import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

class LabaRugi {
    Scanner input = new Scanner(System.in);

    int omzet = 50000000;
    double omzetHarian = omzet / 30;
    int gajiKaryawan = 1500000;
    double gajiKaryawanHarian = gajiKaryawan / 30;
    double pajak = 1.5 / 100;
    double pajakHarian = omzet * pajak / 30;
    int biayaOperasionalHarian = 160000;

    int jumlahKaryawan;
    int jumlahHari;

    void setJumlahKaryawan(int jumlahKaryawan) {
        this.jumlahKaryawan = jumlahKaryawan;
    }

    void setJumlahHari(int jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    void tampilkanLaporan() {
        double totalOmzet = this.omzetHarian * this.jumlahHari;
        totalOmzet = this.jumlahHari % 30 == 0 ? Math.ceil(this.jumlahHari / 30) * this.omzet : totalOmzet;

        double totalGajiKaryawan = this.gajiKaryawanHarian * this.jumlahHari * this.jumlahKaryawan;
        double totalBiayaOperasional = this.biayaOperasionalHarian * this.jumlahHari;

        double totalPajak = this.pajakHarian * this.jumlahHari;

        double pengeluaran = totalGajiKaryawan + totalBiayaOperasional + totalPajak;

        double penghasilanBersih = totalOmzet - pengeluaran;

        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));

        System.out.println("\n---------------------------------------------");
        System.out.println("| Omzet/hari              : Rp " + nf.format(this.omzetHarian));
        System.out.println("| Omzet/bulan             : Rp " + nf.format(this.omzet));
        System.out.println("|\n| Gaji karyawan/hari      : Rp " + nf.format(this.gajiKaryawanHarian));
        System.out.println("| Gaji karyawan/bulan     : Rp " + nf.format(this.gajiKaryawan));
        System.out.println("|\n| Biaya operasional/hari  : Rp " + nf.format(this.biayaOperasionalHarian));
        System.out.println("| Biaya operasional/bulan : Rp " + nf.format(this.biayaOperasionalHarian * 30));
        System.out.println("|\n| Pajak/hari              : Rp " + nf.format(this.pajakHarian));
        System.out.println("| Pajak/bulan             : Rp " + nf.format(this.pajakHarian * 30));
        System.out.println("---------------------------------------------");
        System.out.println("| Total omzet             : Rp " + nf.format(totalOmzet));
        System.out.println("| Total gaji karyawan     : Rp " + nf.format(totalGajiKaryawan));
        System.out.println("| Total biaya operasional : Rp " + nf.format(totalBiayaOperasional));
        System.out.println("| Total pajak             : Rp " + nf.format(totalPajak));
        System.out.println("| Total pengeluaran       : Rp " + nf.format((int) pengeluaran));
        System.out.println("|\n| Penghasilan bersih      : Rp " + nf.format(penghasilanBersih));
        System.out.println("---------------------------------------------");

        if (pengeluaran <= totalOmzet * 7 / 10) {
            System.out.println("\nKesimpulan : Laba untung");
        } else {
            System.out.println("\nKesimpulan : Rugi");
        }
    }

    public static void main(String[] args) {
        clearConsole();
        LabaRugi l = new LabaRugi();

        int jumlahKaryawan = l.inputInt("Jumlah karyawan : ");
        l.setJumlahKaryawan(jumlahKaryawan);

        int jumlahHari = l.inputInt("\nJumlah hari untuk biaya operasional :");
        l.setJumlahHari(jumlahHari);

        l.tampilkanLaporan();
    }

    int inputInt(String message) {
        int num;

        while (true) {
            System.out.println(message);
            String numString = input.nextLine();
            try {
                num = Integer.parseInt(numString);

                if (num > 0) {
                    break;
                } else {
                    clearConsole();
                    System.out.println("Angka yang diinputkan minimal 0!");
                }
            } catch (NumberFormatException e) {
                clearConsole();
                System.out.println("Format angka tidak valid!");
            }
        }

        return num;
    }

    static void clearConsole() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
}
