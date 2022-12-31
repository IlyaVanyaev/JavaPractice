package pr30;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RunTest {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ClassTest.class);
        if (result.wasSuccessful()) {
            System.out.println("positive test check");
        } else {
            System.out.println("negative test check" + result.getFailureCount());
            result.getFailures().forEach(failure -> {
                System.out.println(failure.getTestHeader() + ": " + failure.getMessage());
            });
        }
    }
}
