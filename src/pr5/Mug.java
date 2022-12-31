package pr5;

public class Mug extends Dish{
    private int volume;
    private String shape;

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String getShape() {
        return shape;
    }

    public String toString(){
        return "this is "+shape+" mug";
    }
}
