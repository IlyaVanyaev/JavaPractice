package pr22;

public class MultiFactionalFactory extends Factory{

    @Override
    Chair createChair() {
        return new MultiFunctionalChair();
    }
}
