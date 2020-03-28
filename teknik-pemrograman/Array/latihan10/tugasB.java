import java.util.Scanner;

public class tugasB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan dimensi matriks : ");
        int dimension = Integer.parseInt(scan.nextLine());

        int[][] matrixA = new int[dimension][dimension];
        int[][] matrixB = new int[dimension][dimension];

        System.out.println("\nMatriks A");
        for (int i = 0; i < dimension; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
            String[] answer = scan.nextLine().split("\\s");

            for (int j = 0; j < dimension; j++) {
                matrixA[i][j] = Integer.parseInt(answer[j]);
            }
        }

        System.out.println("\nMatriks B");
        for (int i = 0; i < dimension; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
            String[] answer = scan.nextLine().split("\\s");

            for (int j = 0; j < dimension; j++) {
                matrixB[i][j] = Integer.parseInt(answer[j]);
            }
        }

        scan.close();

        System.out.println("\nA + B");
        for (int i = 0; i < dimension; i++) {
            System.out.print("| ");
            for (int j = 0; j < dimension; j++) {
                System.out.print((matrixA[i][j] + matrixB[i][j]) + " ");
            }
            System.out.print("|\n");
        }

        System.out.println("\nA - B");
        for (int i = 0; i < dimension; i++) {
            System.out.print("| ");
            for (int j = 0; j < dimension; j++) {
                System.out.print((matrixA[i][j] - matrixB[i][j]) + " ");
            }
            System.out.print("|\n");
        }

        System.out.println("\nA * B");
        int[][] multiplyMatrix = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            System.out.print("| ");
            for (int j = 0; j < dimension; j++) {
                for (int k = 0; k < dimension; k++) {
                    multiplyMatrix[i][j] += (matrixA[i][k] * matrixB[k][j]);
                }

                System.out.print(multiplyMatrix[i][j] + " ");
            }
            System.out.print("|\n");
        }
    }
}
