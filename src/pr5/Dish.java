package pr5;

public abstract class Dish {
    private int depth;
    private String shape;

    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getDepth() {
        return depth;
    }

    public String getShape() {
        return shape;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
