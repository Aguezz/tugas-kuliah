import java.util.Scanner;
import java.lang.Math;

class latihan5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter three points : ");
        String pointString = scan.nextLine();

        String[] points = pointString.split("\\s");

        double x1 = Double.parseDouble(points[0]), y1 = Double.parseDouble(points[1]),
                x2 = Double.parseDouble(points[2]), y2 = Double.parseDouble(points[3]),
                x3 = Double.parseDouble(points[4]), y3 = Double.parseDouble(points[5]);

        double a = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        double A = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
        double B = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
        double C = Math.acos((c * c - b * b - a * a) / (-2 * a * b));
        
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        A = Math.round(Math.toDegrees(A * 100));
        A = A / 100;
        B = Math.round(Math.toDegrees(B * 100));
        B = B / 100;
        C = Math.round(Math.toDegrees(C * 100));
        C = C / 100;

        System.out.println("The three angles are " + A + " " + B + " " + C);
    }
}
