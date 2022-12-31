package trash.p3.circle;

public class Circle {
    private int id;
    private Point center;
    private int radius;

    Circle (int id, int x, int y){
        this.id = id;
        center = new Point(x,y);
        radius = (int) (Math.random() * 9) + 1;
    }

    public int getRadius(){
        return radius;
    }

    public String toString(){
        return "Circle " + id + ": center:" + center + ", radius = " + radius;
    }
}
