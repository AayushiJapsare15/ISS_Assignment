package Collections;

import java.util.*;

class SortPrimitiveExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);

        Collections.sort(list);

        System.out.println(list);
    }
}
