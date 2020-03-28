import java.util.Scanner;

public class latihan6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] skor = new int[5];
        double average = 0;

        for (int i = 0; i < skor.length; i++) {
            System.out.print("Masukkan skor ke-" + (i + 1) + " : ");
            skor[i] = scan.nextInt();

            if (skor[i] > 100) {
                System.out.println("Angka skor maksimal 100");
                return;
            }

            average += skor[i];
        }

        average = average / skor.length;
        System.out.println("\nRata-rata skor adalah " + average);
    }
}
