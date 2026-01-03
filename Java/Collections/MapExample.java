package Collections;

import java.util.*;

class MapPrimitiveOperations {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        // Add (put)
        map.put(1, "Aayushi");
        map.put(2, "Rahul");
        map.put(3, "Neha");

        System.out.println("Map: " + map);

        // Update (same key)
        map.put(2, "Rohan");

        // Search
        System.out.println("Contains key 1? " + map.containsKey(1));
        System.out.println("Contains value Neha? " + map.containsValue("Neha"));

        // Get value
        System.out.println("Value of key 2: " + map.get(2));

        // Remove
        map.remove(3);

        // Iterate
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
