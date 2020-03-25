import java.util.Scanner;

/**
 * @author Agus Stiawan - H96219038
 */

class latihan2 {
    public static void main(String[] args) {
        int i, j, n, s, x;

        System.out.print("Number of rows : ");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        s = n + 4 - 1;
        for (i = 1; i < s - 2; i++) {
            for (x = s - 2; x > i ; x--) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
