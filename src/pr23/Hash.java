package pr23;

public class Hash {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;
        Object o4 = "String object";
        Object o5 = 123;
        System.out.println("object1 hashCode: " + o1.hashCode());
        System.out.println("object2 hashCode: " + o2.hashCode());
        System.out.println("object3 hashCode: " + o3.hashCode());
        System.out.println("object4 hashCode: " + o4.hashCode());
        System.out.println("object5 hashCode: " + o5.hashCode());

        System.out.println("object1 == object2: " + (o1 == o2));
        System.out.println("object1 == object3: " + (o1 == o3));
        System.out.println("object1.equals(object2): " + o1.equals(o2));
        System.out.println("object1.equals(object3): " + o1.equals(o3));
        System.out.println("object4.equals(object5): " + o4.equals(o5));
    }
}
