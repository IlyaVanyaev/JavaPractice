package trash;

public class test {


    static void rnd (int a, int b){
        System.out.print((int) (Math.random() * b) + a + " ");
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++) rnd(1,4);
    }
}
