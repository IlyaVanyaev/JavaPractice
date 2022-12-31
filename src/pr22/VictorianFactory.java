package pr22;

public class VictorianFactory extends Factory{
    Chair createChair(){
        return new VictorianChair();
    }
}
