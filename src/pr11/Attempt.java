package pr11;

public class Attempt {
    private int counter;

    public Attempt(int counter) {
        this.counter = counter;
    }

    public int getAttempt() {
        return counter;
    }

    public void up() {
        counter++;

    }

    public void down() {
        counter--;
    }
}
