package pr1;

import java.text.DecimalFormat;
import java.util.Random;

public class Rand {
    private double[] m;
    private int n;

    Rand (int n){
        this.n = n;
        m = new double[n];
    }


    public void setMathRandom() {
        for (int i = 0; i < n; i++) m[i] = Math.random() * n;
    }

    public void setRandom(){
        Random rand = new Random();
        for (int i = 0; i < n; i++) m[i] = rand.nextDouble(n);
    }

    public void getM(){
        DecimalFormat df = new DecimalFormat("#.###");
        for (int i = 0; i < n; i++) System.out.print(df.format(m[i]) + " ");
        System.out.println();
    }

    public void sortM(){
        double temp;
        boolean iteration = true;
        while (iteration) {
            iteration = false;
            for (int i = 1; i < n; i++) {
                if (m[i] < m[i - 1]) {
                    temp = m[i];
                    m[i] = m[i-1];
                    m[i-1] = temp;
                    iteration = true;
                }
            }
        }
        System.out.println("sorted");
    }

    public static void main (String[] args){
        Rand x = new Rand(10);
        x.setMathRandom();
        x.getM();
        x.sortM();
        x.getM();
        System.out.println();
        Rand y = new Rand(10);
        y.setRandom();
        y.getM();
        y.sortM();
        y.getM();
    }
}
