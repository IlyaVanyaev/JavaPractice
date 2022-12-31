package pr15;

public class Main {
    public static void main(String[] args) {
        File x = new File();

        x.input("file.txt");
        x.output("file.txt");
        x.input("file.txt");
        x.output("file.txt");
        x.addInput("file.txt");
        x.output("file.txt");
    }
}
