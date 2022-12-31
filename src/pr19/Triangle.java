package pr19;

public class Triangle {
    private int firstAngle;
    private int secondAngle;
    private int thirdAngle;

    public Triangle(int angle1, int angle2, int angle3) throws Exception {
        if (angle1 + angle2 + angle3 != 180) {
            throw new Exception("The sum of the angles of a triangle cannot be greater than 180 degrees");
        }
        this.firstAngle = angle1;
        this.secondAngle = angle2;
        this.thirdAngle = angle3;
    }

    public int getFirstAngle() {
        return firstAngle;
    }

    public int getSecondAngle() {
        return secondAngle;
    }

    public int getThirdAngle() {
        return thirdAngle;
    }

    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(35, 60, 90);
            System.out.println("angle 1: " + triangle.getFirstAngle());
            System.out.println("angle 2: " + triangle.getSecondAngle());
            System.out.println("angle 3: " + triangle.getThirdAngle());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
