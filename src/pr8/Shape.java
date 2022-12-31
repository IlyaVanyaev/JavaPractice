package pr8;

public abstract class Shape {
    private String color;
    private int x;
    private int y;
    private int w;
    private int h;

    Shape(){
        x = (int)(Math.random() * 400) + 100;
        y = (int)(Math.random() * 400) + 100;
        w = (int)(Math.random() * 100) + 20;
        h = (int)(Math.random() * 100) + 20;
    }

    public String getColor() {
        int rnd;
        rnd = (int) (Math.random() * 4) + 1;
        return switch (rnd) {
            case 1 -> "RED";
            case 2 -> "GREEN";
            case 3 -> "YELLOW";
            case 4 -> "BLUE";
            default -> "";
        };
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }
}

class Rectangle extends Shape{

    Rectangle(){
        super();
    }
}
