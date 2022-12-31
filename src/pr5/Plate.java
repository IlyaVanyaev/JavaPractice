package pr5;

public class Plate extends Dish{
    private String shape;
    private int depth;

    @Override
    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String getShape() {
        return shape;
    }

    @Override
    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public int getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "this is "+shape+" plate";
    }
}
