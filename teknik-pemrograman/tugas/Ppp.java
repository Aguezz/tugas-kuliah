import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Ppp {
    public static void main(String[] args) {
        String password = "aagus";
        // Pattern pattern = Pattern.compile("^(?=^[0-9a-zA-Z]+$)(?=\\d{2,})+$");
        Pattern pattern1 = Pattern.compile("^[0-9a-zA-Z]+$");
        Pattern pattern2 = Pattern.compile("[0-9]");

        Matcher m1 = pattern1.matcher(password);
        Matcher m2 = pattern2.matcher(password);

        System.out.println(m1.find());
        System.out.println(m2.find());
        System.out.println(m1.find() && m2.find());

        // while (m.find()) {
        //     System.out.println(m.);
        // }
        // System.out.println(Pattern.matches(pattern, password));
    }
}
