import java.util.Scanner;

public class Pola {
    int dimension;

    void setDimension(int dimension) {
        this.dimension = dimension;
    }

    int getDimension() {
        return this.dimension;
    }

    void showStars() {
        for (int i = 0; i < this.getDimension(); i++) {
            for (int j = this.getDimension(); j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pola p = new Pola();

        System.out.print("Masukkan jumlah dimensi pola : ");
        int dimension = input.nextInt();

        p.setDimension(dimension);
        p.showStars();

        input.close();
    }
}
