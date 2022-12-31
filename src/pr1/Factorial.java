package pr1;

public class Factorial {
    void fact (int n){
        int f = 1;
        for (int i = 1; i <= n; i++){
            f *= i;
        }
        System.out.print(n + "! = " + f);
    }
}
