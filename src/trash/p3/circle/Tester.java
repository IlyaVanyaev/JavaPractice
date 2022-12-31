package trash.p3.circle;


public class Tester {
    private int amount;
    private Circle[] m;

    Tester (int n){
        this.amount = n;
        m = new Circle[amount];
    }

    public void addCircle(){
        for (int i = 0; i < amount; i++) m[i] = new Circle(i+1, (int)(Math.random()*10), (int)(Math.random()*10));
    }

    public void showCircles(){
        for (int i = 0; i < amount; i++) System.out.println(m[i]);
    }

    public void minCircle(){
        int min, z = 0;
        for (int i = 1; i < amount; i++){
            min = Math.min(m[i-1].getRadius(),m[i].getRadius());
            if (m[i].getRadius() == min) z = i;
        }
        System.out.println("the smallest circle is " + m[z]);
    }

    public void maxCircle(){
        int max, z = 0;
        for (int i = 1; i < amount; i++){
            max = Math.max(m[i-1].getRadius(),m[i].getRadius());
            if (m[i].getRadius() == max) z = i;
        }
        System.out.println("the biggest circle is " + m[z]);
    }

    public static void main (String[] args){
        Tester x = new Tester(4);
        x.addCircle();
        x.showCircles();
        x.minCircle();
        x.maxCircle();
    }
}
