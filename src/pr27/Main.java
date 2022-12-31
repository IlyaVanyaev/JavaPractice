package pr27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> nameMap = new HashMap<>();
        nameMap.put("Smith", "John");
        nameMap.put("Johnson", "Mike");
        nameMap.put("Williams", "Kate");
        nameMap.put("Jones", "John");
        nameMap.put("Brown", "Anne");
        nameMap.put("Davis", "Tom");
        nameMap.put("Miller", "Chris");
        nameMap.put("Wilson", "Kate");
        nameMap.put("Moore", "Bill");
        nameMap.put("Taylor", "Anne");

        // удаление людей с одинаковыми именами
        nameMap.values().removeIf(name -> Collections.frequency(nameMap.values(), name) > 1);

        // вывод словаря
        for (Map.Entry<String, String> entry : nameMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
}
