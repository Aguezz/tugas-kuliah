import java.util.Scanner;

public class latihan8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean[][] rooms = {
            {true, true, true},
            {false, false, false},
            {true, true, false},
            {true, true, false, false},
        };

        System.out.println("Selamat Datang di Hotel California");
        System.out.print("Masukkan nomor lantai : ");
        int floor = Integer.parseInt(scan.nextLine());

        int emptyRoom = 0;
        for (int i = 0; i < rooms[floor - 1].length; i++) {
            if (rooms[floor - 1][i]) emptyRoom++;
        }

        System.out.println("Jumlah kamar : " + rooms[floor - 1].length);
        System.out.println("Kamar kosong : " + emptyRoom);
        System.out.println("Kamar terisi : " + (rooms[floor - 1].length - emptyRoom));

        System.out.println("\nTerima kasih");
        scan.close();
    }
}
