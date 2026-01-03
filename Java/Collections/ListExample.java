package Collections;

import java.util.*;

class ListPrimitiveOperations {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);

        System.out.println("List: " + numbers);

        numbers.remove(Integer.valueOf(20));
        System.out.println("After remove: " + numbers);

        numbers.set(1, 99);
        System.out.println("After update: " + numbers);

        System.out.println("Contains 30? " + numbers.contains(30));

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
