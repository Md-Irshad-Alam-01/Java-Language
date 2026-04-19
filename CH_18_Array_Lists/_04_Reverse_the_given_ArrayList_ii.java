package CH_18_Array_Lists;

import java.util.ArrayList;
import java.util.Collections;

public class _04_Reverse_the_given_ArrayList_ii {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<> () ;
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List =" +list);
        Collections.reverse(list);
        System.out.println("Reverse List =" +list);
    }
}
