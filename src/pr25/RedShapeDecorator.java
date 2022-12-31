package pr25;

public class RedShapeDecorator extends ShapeDecorator{
    protected RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw(){
        if (shape != null){
            shape.draw();
        }
        setRedBorder();
    }

    private void setRedBorder(){
        System.out.println("----------------------- Red border set");
    }
}
