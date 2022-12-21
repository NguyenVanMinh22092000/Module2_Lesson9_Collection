package set_list_map;

import java.util.HashMap;
import java.util.Map;

public class MapExample01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Minh");
        map.put(4, "Opp");
        
        for(Integer key: map.keySet()){
            String value = map.get(key);
            System.out.println(" key = " + key + " value: " + value);
        }
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
