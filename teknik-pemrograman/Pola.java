import java.util.Scanner;

public class Pola {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah dimensi pola : ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
