public class Persegi {
    int panjang, lebar;
    public static void main(String[] args) {
        Persegi p = new Persegi();

        p.setPanjang(10);
        p.setLebar(5);

        System.out.println("Panjang     :" + p.getPanjang());
        System.out.println("Lebar       :" + p.getLebar());
        System.out.println("Luas        :" + p.getLuas());
    }

    void setPanjang(int p) {
        panjang = p;
    }

    void setLebar(int l) {
        lebar = l;
    }

    int getPanjang() {
        return panjang;
    }

    int getLebar() {
        return lebar;
    }

    int getLuas() {
        return panjang * lebar;
    }
}
