package pr1;
import java.text.DecimalFormat;

public class Harmony {
    public static void main (String [] args){
        DecimalFormat r = new DecimalFormat("#.###");
        float n = 1f, u;
        while (n <= 10){
            u = 1 / n;
            if (n == 10) System.out.println(r.format(u));
            else System.out.print(r.format(u) + " + ");
            n++;
        }
    }
}



