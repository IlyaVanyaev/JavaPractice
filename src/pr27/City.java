package pr27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class City {
    private String city;
    private String country;

    public City(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        City x = new City("Moscow","Russia");
        City y = new City("Saratov","Russia");
        City z = new City("San Paulo","Brazil");
        City w = new City("Rio de Janeiro","Brazil");
        // добавление городов
        map.put(x.country, new ArrayList<String>() {{ add(x.city); add(y.city); }});
        map.put(z.country, new ArrayList<String>() {{ add(z.city); add(w.city); }});

        // вывод словаря
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
