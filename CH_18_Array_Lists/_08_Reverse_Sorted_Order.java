package CH_18_Array_Lists;

import java.util.ArrayList;
import java.util.Collections;

public class _08_Reverse_Sorted_Order {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Welcome");
        list.add("to");
        list.add("Fatima");
        list.add("Family");
        System.out.println("Original Order="+list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted Order="+list);
    }
}

