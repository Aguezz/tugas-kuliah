import java.util.Arrays;

public class latihan3 {
    public static void main(String[] args) {
        int[] angka1 = {1, 2, 3};
        int[] angka2 = angka1;

        System.out.println(Arrays.toString(angka1));
        System.out.println(Arrays.toString(angka2));

        ubah(angka1);

        System.out.println(Arrays.toString(angka1));
        System.out.println(Arrays.toString(angka2));
    }

    static void ubah(int[] angka) {
        angka[0] = 100;
    }
}
