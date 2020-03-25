import java.util.Scanner;

/**
 * @author Agus Stiawan - H96219038
 */

class latihan1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input number: ");
        int num = scan.nextInt();
        System.out.println("The first n natural numbers are : " + num);

        int total = 0;

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
            total += i;
        }

        System.out.println("The sum of Natural Number upto " + num + " terms : " + total);
    }
}
