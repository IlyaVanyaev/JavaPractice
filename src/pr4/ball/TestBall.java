package pr4.ball;

public class TestBall {
    public static void main(String[] args) {
        Ball x = new Ball(3,5);
        System.out.println(x);
        x.move(2,3);
        System.out.println(x);


        Ball y = new Ball();
        y.setX(4);
        y.setY(8);
        System.out.println(y.getX());
        System.out.println(y.getY());
        System.out.println(y);
        y.move(-2,-5);
        System.out.println(y);
    }
}
