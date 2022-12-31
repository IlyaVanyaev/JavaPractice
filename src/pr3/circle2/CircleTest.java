package pr3.circle2;

public class CircleTest {
    public static void main(String [] args){
        Circl x = new Circl("alpha");
        x.setRadius(4);
        System.out.println(x.getRadius());
        System.out.println(x.getLength());
        System.out.println(x.getArea() + "\n");

        Circl y = new Circl("beta");
        y.setRadius(7);
        System.out.println(y.getRadius());
        System.out.println(y.getLength());
        System.out.println(y.getArea() + "\n");

        x.compare(x,y);
    }
}
