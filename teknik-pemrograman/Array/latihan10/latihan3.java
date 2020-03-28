import java.util.Arrays;
import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        float[][] price = {
            {1000.0f, 500.0f, 2500.0f},
            {3000.0f, 2000.0f, 8000.0f},
            {25000.0f, 70000.0f, 69000.0f},
            {10000.0f, 13000.0f, 71000.0f},
            {17500.0f, 72000.0f, 19000.0f},
            {22500.0f, 85000.0f, 87500.0f},
            {5500.0f, 95000.0f, 62000.0f},
            {38000.0f, 29000.0f, 90000.0f},
            {55000.0f, 72500.0f, 16000.0f},
            {79000.0f, 45000.0f, 7000.0f},
            {0, 0, 0},
        };

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < (price.length - 1); i++) {
            System.out.println((i + 1) + " --> " + Arrays.toString(price[i]));
        }

        System.out.print("Masukkan nomor dari elemen yang anda inginkan [1-10] : ");
        int number = scan.nextInt();

        float[] newPrice = new float[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan harga kolom ke-" + (i + 1) + " : ");
            newPrice[i] = scan.nextFloat();
        }
        scan.close();

        for (int i = (price.length - 2); i >= (number - 1); i--) {
            price[i + 1] = price[i];
        }

        price[number - 1] = newPrice;
        System.out.println("Daftar harga baru");
        for (int i = 0; i < price.length; i++) {
            System.out.println((i + 1) + " --> " + Arrays.toString(price[i]));
        }
    }
}
