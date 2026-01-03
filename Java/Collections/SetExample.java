package Collections;

import java.util.*;

class SetPrimitiveOperations {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);   // duplicate, ignored

        System.out.println("Set: " + numbers);

        numbers.remove(10);
        System.out.println("After remove: " + numbers);

        System.out.println("Contains 30? " + numbers.contains(30));

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
