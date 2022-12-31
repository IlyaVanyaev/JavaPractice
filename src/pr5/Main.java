package pr5;

public class Main {
    public static void main(String[]args){
        Dish x = new Mug();
        Dish y = new Plate();

        x.setVolume(20);
        x.setShape("round");
        System.out.println(x.getVolume());
        System.out.println(x.getShape());
        System.out.println(x);

        y.setDepth(5);
        y.setShape("square");
        System.out.println(y.getDepth());
        System.out.println(y.getShape());
        System.out.println(y);

    }
}
