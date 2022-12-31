package pr2.shape;

public class TestShape {
    public static void main(String[] args) {
        Shape x = new Shape();
        x.setName("octagon");
        x.setCorners(8);
        System.out.println(x.getName());
        System.out.println(x.getCorners());
        System.out.println(x);
    }
}
