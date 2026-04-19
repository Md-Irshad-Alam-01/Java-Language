package CH_18_Array_Lists;

import java.util.ArrayList;
import java.util.Collections;

public class _05_Sort_an_ArrayList_in_Ascending_Order {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<> ();
        list.add(12);
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(3);
        System.out.println("Original list ="+list);
        Collections.sort(list);
        System.out.println("Ascending order =" +list);
    }
}
