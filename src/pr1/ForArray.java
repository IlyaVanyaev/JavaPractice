package pr1;
import java.util.Scanner;
public class ForArray {
    public static void main (String [] args){
        int s = 0, av, n = 5;
        int [] m = new int [n];
        Scanner put = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            m[i] = put.nextInt();
        }

        for (int i = 0; i < n; i++){
            s+= m[i];
        }
        av = s / n;
        System.out.print(s + " " + av);
    }
}
