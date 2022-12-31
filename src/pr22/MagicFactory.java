package pr22;

public class MagicFactory extends Factory{

    @Override
    Chair createChair() {
        return new MagicChair();
    }
}
