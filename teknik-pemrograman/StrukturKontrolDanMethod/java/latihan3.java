import java.util.Scanner;

/**
 * @author Agus Stiawan - H96219038
 */

class latihan3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------------------------------------");
            System.out.println("\nPusat Informasi Dampak Virus Corona terhadap \nSektor Perdagangan dan Pariwisata Indonesia");
            System.out.println("-------------------------------------------------------");
            System.out.println("[1] Dampak Wabah Virus Corona terhadap Sektor Perdagangan");
            System.out.println("[2] Dampak Wabah Virus Corona terhadap Sektor Pariwisata");
            System.out.println("[3] Upaya Mengatasinya");
            System.out.println("[4] Keluar");
            System.out.println("-------------------------------------------------------");

            System.out.print("Pilih menu [1/2/3/4] : ");
            String input = scan.nextLine();

            System.out.println();

            if (input.equals("1")) {
                System.out.println("Dampak Wabah Virus Corona terhadap Sektor Perdagangan");
                System.out.println("a. Menurunnya ekonomi Indonesia sebesar 0,1 - 0,3%");
                System.out.println("b. Ekspor nonmigas pada Januari 2020 mengalami penurunan jika dibandingkan Desember 2019");
                System.out.println("c. Impor nonmigas pada Januari 2020 juga ikut menurun");
                System.out.println("d. Ekspor minyak kelapa, Impor bawang putih dan impor komoditas buah-buahan juga mengalami penurunan.");

            } else if (input.equals("2")) {
                System.out.println("Dampak Wabah Virus Corona terhadap Sektor Pariwisata");
                System.out.println("a. Pemerintah juga menghentikan penerbangan dari dan ke China per 5 Februari 2020");
                System.out.println("b. Februari 2020 tercatat 22.000 wisatawan China batal ke Bali (tribunnews.com, 14 Februari 2020). Hal tersebut sangat memengaruhi perekonomian Provinsi Bali.");
                System.out.println("c. penurunan wisatawan di Bali mencapai 50%");

            } else if (input.equals("3")) {
                System.out.println("Upaya Mengatasinya");
                System.out.println("a. Pemerintah Indonesia perlu melakukan diversifikasi pasar ekspor negara tujuan utama");
                System.out.println("b. Pemerintah juga perlu mengoptimalkan penggunaan produksi dalam negeri yang dapat memenuhi permintaan kebutuhan di pasar domestik");
                System.out.println("c. Untuk perdagangan produk pertanian, saat ini Kementerian Pertanian sudah berupaya membuat langkah kebijakan untuk mengantisipasi penurunan ekspor pertanian ke China");
                System.out.println("d. Kementerian Pertanian juga berupaya mencari negara alternatif lainnya untuk impor bawang putih dan mendorong produksi bawang putih dalam negeri");
                System.out.println("e. Pemerintah perlu mendorong masyarakat untuk meningkatkan konsumsi produk buah-buahan lokal");
                System.out.println("f. meningkatkan daya saing kualitas dan daya tarik pariwisata dalam negeri");
                System.out.println("g. mempromosikan daerah-daerah wisata lainnya di Indonesia dan meningkatkan layanan maupun fasilitas di tempat-tempat wisata");

            } else {
                System.out.println("Terima kasih");
                break;
            }

            System.out.print("\nTekan [enter] untuk melanjutkan : ");
            scan.nextLine();
        }
    }
}
