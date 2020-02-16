import java.text.NumberFormat;
import java.util.Locale;

class RupiahToReal {
    public static void main(String[] args) {
        int rupiah = 213000000;
        double riyal = 3651.53;

        double totalRiyal = rupiah / riyal;

        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));
        String prettyRupiah = nf.format(rupiah);
        String prettyTotalRiyal = nf.format((int) totalRiyal);

        System.out.format("Rp %s dalam Riyal adalah %s\n", prettyRupiah, prettyTotalRiyal);
    }
}