package pr22;

import java.util.HashMap;

public class Main {

    private static final HashMap<String, Factory> factories = new HashMap<>();

    static {
        factories.put("Victorian", new VictorianFactory());
        factories.put("Multifunctional", new MultiFunctionalFactory());
        factories.put("Magic", new MagicFactory());
    }


    public static void main(String[] args) {
        Client client = new Client();
        for (String chairType : factories.keySet()) {
            client.sit(factories.get(chairType).createChair());
        }
    }
}
