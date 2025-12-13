package concepts.collections;

import java.util.*;

public class MapsExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Name", 1);
        map.put("email", 2);

        Map<Integer,List<Integer>> listMap = new HashMap<>();

        listMap.computeIfAbsent(1, f -> new ArrayList<>()).add(1);

        System.out.println(listMap.get(1));

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

        for(Map.Entry<String,Integer> entry: entrySet)
            System.out.println(entry.getKey() + " " + entry.getValue());

        Set<String> keySets = map.keySet();

        for(String key: keySets)
            System.out.println(key + " " + map.get(key));

        NavigableMap<Integer,String> tmap = new TreeMap<>((a,b) -> b - a);

        tmap.put(1, "Divyanshu");
        tmap.put(2, "Raj");
    }
}
