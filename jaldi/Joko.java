import java.util.Scanner;

class Joko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int b = input.nextInt();
        int t = input.nextInt();

        if (b == 1) {
            System.out.println("Januari, 31");
        } else if (b == 2) {
            if (t % 4 == 0) {
                System.out.println("Februari, 29");
            } else {
                System.out.println("Februari, 28");
            }
        } else if (b == 3) {
            System.out.println("Maret, 31");
        } else if (b == 4) {
            System.out.println("April, 30");
        } else if (b == 5) {
            System.out.println("Mei, 31");
        } else if (b == 6) {
            System.out.println("Juni, 30");
        } else if (b == 7) {
            System.out.println("Juli, 31");
        } else if (b == 8) {
            System.out.println("Agustus, 31");
        } else if (b == 9) {
            System.out.println("September, 30");
        } else if (b == 10) {
            System.out.println("Oktober, 31");
        } else if (b == 11) {
            System.out.println("November, 30");
        } else if (b == 12) {
            System.out.println("Desember, 31");
        }
    }
}