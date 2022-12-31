package pr25;

public class Decorator {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        ShapeDecorator redRectangle = new RedShapeDecorator(rectangle);

        redCircle.draw();
        redRectangle.draw();
    }
}
