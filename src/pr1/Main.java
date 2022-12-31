package pr1;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Factorial x = new Factorial();
        Scanner put = new Scanner(System.in);
        int n = put.nextInt();
        x.fact(n);
    }
}
