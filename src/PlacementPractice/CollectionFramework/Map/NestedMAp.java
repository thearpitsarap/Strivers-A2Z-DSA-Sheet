package PlacementPractice.CollectionFramework.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NestedMAp {
    public static void main(String[] args) {
        Map<String,Map<String,List<String>>> map = new HashMap<>();
        
        List<String> cities = new ArrayList<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Nagpur");

        List<String> cities1 = new ArrayList<>();
        cities1.add("Banglore");
        cities1.add("Hydrabad");
        cities1.add("Police");

        Map<String,List<String>> states = new HashMap<>();

        states.put("Maharashtra", cities);
        states.put("Karnataka", cities1);
        map.put("India", states);

        map.forEach((c,s)->{
            System.out.println(c + " " + s);            
        });
    }
}