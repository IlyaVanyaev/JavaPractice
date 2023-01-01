package pr5;

public class Table extends Furniture{
    private String title;
    private String color;
    private int cost;


    Table(String title) {
        this.title = title;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "this is "+title+" with "+color+" color, "+cost+" cost";
    }

}
