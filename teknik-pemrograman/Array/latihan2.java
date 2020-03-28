public class latihan2 {
    public static void main(String[] args) {
        int[] skor = {100, 85, 90}; 

        for (int i = 0; i < skor.length; i++) {
            System.out.println(skor[i]);
        }

        for (int item: skor) {
            System.out.println(item);
        }
    }
}
