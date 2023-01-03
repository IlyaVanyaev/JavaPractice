package pr22;

public class MultiFunctionalFactory extends Factory{

    @Override
    Chair createChair() {
        return new MultiFunctionalChair();
    }
}
