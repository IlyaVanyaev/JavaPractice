package pr24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        String re = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern p = Pattern.compile(re);
        String[] testIP = {"127.0.0.1", "255.255.255.0", "1300.6.7.8", "abc.def.gha.bcd"};

        for (String test : testIP) {
            Matcher m = p.matcher(test);
            System.out.println(test + ": " + m.matches());
        }
    }
}
