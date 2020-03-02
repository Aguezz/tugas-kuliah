public class Pola {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            String stars = "";
            for (int j = 7; j > i; j--) {
                stars += "*";
            }
            System.out.println(stars);
        }
    }
}
