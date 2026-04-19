package CH_18_Array_Lists;

import java.util.*;

public class _06_Sort_an_ArrayList_in_Descending_Order {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(5);
        list.add(32);
        list.add(12);
        list.add(50);
        System.out.println("Original list " +list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order" +list);
    }
}
