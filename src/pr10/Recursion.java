package pr10;

import java.util.Scanner;

public class Recursion {
    public static void rec2 (int i, int n){
        if (i <= n){
            System.out.print(i);
            if (i != n) System.out.print(" ");
            rec2(i+1,n);
        }
    }

    public static String rec3 (int A, int B){
        if (A > B) {
            if (A == B) {
                return Integer.toString(A);
            }
            return A + " " + rec3(A - 1, B);
        } else {
            if (A == B) {
                return Integer.toString(A);
            }
            return A + " " + rec3(A + 1, B);
        }
    }

    public static int rec4(int k, int s, int sum, int len){
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int r = 0;
        int t = 0;
        if (len==0) t=1;
        for (int i = t; i < 10; i++) {
            r+= rec4(k,s,sum+i,len+1);
        }
        return r;
    }

    public static int rec5(int N){
        if (N < 10) {
            return N;
        }
        else {
            return N % 10 + rec5(N / 10);
        }
    }

    public static String rec6(int n, int i){
        if (n < 2) {
            return "NO";
        }
        else if (n == 2) {
            return "YES";
        }
        else if (n % i == 0) {
            return "NO";
        }
        else if (i < n / 2) {
            return rec6(n, i + 1);
        } else {
            return "YES";
        }
    }



    public static void main(String[] args){
        System.out.println("rec2 is running:");
        rec2(1,10);
        System.out.println();

        System.out.println("rec3 is running:");
        System.out.println(rec3(5,8));

        System.out.println("rec4 is running:");
        System.out.println(rec4(3,4,0,0));

        System.out.println("rec5 is running:");
        System.out.println(rec5(1234));

        System.out.println("rec6 is running:");
        System.out.println(rec6(11,2));
    }
}
