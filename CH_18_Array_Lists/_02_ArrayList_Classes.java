package CH_18_Array_Lists;

import java.util.ArrayList;


public class _02_ArrayList_Classes {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Boolean> l2 = new ArrayList<>();

        //Add new Element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //get an element at index 1
        System.out.println("get an element at index 1");
        System.out.println(l1.get(1));
        System.out.println();

        //print with for loop
        System.out.println("print with for loop");
        for ( int i = 0 ; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        //printing the arraylist directly
        System.out.println();
        System.out.println("printing the arraylist directly");
        System.out.println(l1);

        //adding element at some index
        l1.add(1, 100);
        System.out.println();
        System.out.println("adding element at some index");
        System.out.println(l1);

        //modifying element at index 1
        l1.set(1, 10);
        System.out.println();
        System.out.println("modifying element at index 1");
        System.out.println(l1);

        //removing an element
        l1.remove(Integer.valueOf(7));
        System.out.println();
        System.out.println("removing an element");
        System.out.println(l1);

        //checking if an element exist
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println();
        System.out.println("checking if an element exist");
        System.out.println(ans);
        //if not present
        boolean ans1 = l1.contains(Integer.valueOf(60));
        System.out.println("checking if an element exist");
        System.out.println(ans1);

        //if you don't specify class, you can put anything inside l
        ArrayList<Object> l = new ArrayList();
        l.add("pq");
        l.add(1);
        l.add(true);
        System.out.println();
        System.out.println("if you don't specify class, you can put anything inside l");
        System.out.println(l);

    }
}

