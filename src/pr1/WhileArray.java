package pr1;
import java.util.Scanner;

public class WhileArray {
    public static void main (String [] args){
        int n = 5, i, s = 0, ma = 0, mi = 100;
        int [] m = new int [n];
        Scanner put = new Scanner(System.in);
        i = 0;
        while (i < n){
            m[i] = put.nextInt();
            i++;
        }
        i = 0;
        while (i < n){
            s += m[i];
            if (m[i] > ma){
                ma = m[i];
            }
            if (m[i] < mi){
                mi = m[i];
            }
            i++;
        }
        System.out.print(s + " " + ma + " " + mi + '\n');
        s = 0; i = 0; ma = 0; mi = 100;
        do {
            s+=m[i];
            if (m[i] > ma) ma = m[i];
            if (m[i] < mi) mi = m[i];
            i++;
        } while (i < n);
        System.out.print(s + " " + ma + " " + mi + '\n');

    }
}
