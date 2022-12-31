package pr2.shape;

public class Shape {
    private String name;
    private int corners;

    public void setName(String name) {
        this.name = name;
    }

    public void setCorners(int corners) {
        this.corners = corners;
    }

    public int getCorners() {
        return corners;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "this is " + name + ", it has "+corners+" corners";
    }
}
