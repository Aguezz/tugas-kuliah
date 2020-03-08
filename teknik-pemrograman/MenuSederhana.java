import java.util.Scanner;

public class MenuSederhana {
    String name, hobby, favoriteFood;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setHobby(String hobby) {
        this.hobby = hobby;
    }

    String getHobby() {
        return this.hobby;
    }

    void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    String getFavoriteFood() {
        return this.favoriteFood;
    }

    void printMenu() {
        System.out.println("---------------------");
        System.out.println("Menu Sederhana");
        System.out.println("---------------------");
        System.out.println("[1] Nama Diri");
        System.out.println("[2] Hobi Diri");
        System.out.println("[3] Makanan Favorit");
        System.out.println("[4] Tampilkan");
        System.out.println("[5] Keluar");
        System.out.print("Masukkan nomor pilihan Anda (1-5) : ");
    }

    void showIdentity(Scanner input) {
        clearConsole();
        System.out.println("-------------------------------");
        System.out.println("Nama            : " + this.name);
        System.out.println("Hobi            : " + this.hobby);
        System.out.println("Makanan favorit : " + this.favoriteFood);
        System.out.println("-------------------------------\n");
        System.out.println("Tekan [ENTER] untuk melanjutkan :\n");

        input.nextLine();
    }

    public static void main(String[] args) {
        clearConsole();
        Scanner input = new Scanner(System.in);
        MenuSederhana m = new MenuSederhana();

        while (true) {
            m.printMenu();
            String select = input.nextLine();

            System.out.println("\nIni menu no. " + select);

            if (select.equals("1")) {
                System.out.print("Nama saya : ");
                m.setName(input.nextLine());
                clearConsole();

            } else if (select.equals("2")) {
                System.out.print("Hobi saya : ");
                m.setHobby(input.nextLine());
                clearConsole();

            } else if (select.equals("3")) {
                System.out.print("Makanan favorit saya : ");
                m.setFavoriteFood(input.nextLine());
                clearConsole();

            } else if (select.equals("4")) {
                clearConsole();
                m.showIdentity(input);
                clearConsole();

            } else if (select.equals("5")) {
                break;

            } else {
                clearConsole();
                System.out.println("\n\nAngka yang anda masukkan salah!");
            }
        }

        input.close();
    }

    static void clearConsole() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
}
