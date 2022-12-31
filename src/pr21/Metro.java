package pr21;
import java.util.List;
import java.util.Arrays;

public class Metro {
    private List<String> metro = Arrays.asList("Violet", "Green", "Grey", "Blue", "Yellow", "Red");

    public void printList(boolean even) {
        for (int i = 0; i < metro.size(); i++) {
            if (even) {
                if (i % 2 == 0) {
                    System.out.println(metro.get(i));
                }
            } else {
                if (i % 2 != 0) {
                    System.out.println(metro.get(i));
                }
            }

        }
    }

    public static void main(String[] args) {
        Metro metro = new Metro();
        System.out.println("true:");
        metro.printList(true);
        System.out.println("false:");
        metro.printList(false);
    }
}
