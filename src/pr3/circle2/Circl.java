package pr3.circle2;

public class Circl {

    private String id;
    private int radius;
    private double length;
    private double area;

    Circl (String id){
        this.id = id;
    }
    public void setRadius (int radius){
        this.radius = radius;
    }

    public int getRadius() {
        System.out.print("R " + id + " = ");
        return radius;
    }

    public double getArea(){
        System.out.print("S " + id + " = ");
        return area = radius * radius * 3.14;
    }

    public double getLength(){
        System.out.print("P " + id + " = ");
        return length = 2 * 3.14 * radius;
    }

    public void compare(Circl x, Circl y){
        if (x.area > y.area) System.out.println("circle " + x.id + " > circle " + y.id);
        else if (x.area < y.area) System.out.println("circle " + x.id + " < circle " + y.id);
        else System.out.println("circle " + x.id + " equals circle " + y.id);
    }
}
