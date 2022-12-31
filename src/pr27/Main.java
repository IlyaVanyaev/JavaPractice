package pr27;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> nameMap = new HashMap<>();
        nameMap.put("Smith", "John");
        nameMap.put("Walker", "Paul");
        nameMap.put("Diesel", "Vin");
        nameMap.put("Jones", "John");
        nameMap.put("Brown", "James");
        nameMap.put("Taylor", "Tom");
        nameMap.put("Rock", "Chris");
        nameMap.put("Hudson", "Kate");
        nameMap.put("Milligan", "Bill");
        nameMap.put("Boleyn", "Anne");

        // удаление людей с одинаковыми именами
        nameMap.values().removeIf(name -> Collections.frequency(nameMap.values(), name) > 1);

        // вывод словаря
        for (Map.Entry<String, String> entry : nameMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
}
