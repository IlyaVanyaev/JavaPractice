package pr5;

public abstract class Furniture {
    private String color;
    private int cost;

    protected String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "this is "+title+" with "+color+" color, "+cost+" cost";
    }
}
