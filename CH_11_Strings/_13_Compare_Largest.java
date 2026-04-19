package CH_11_Strings;

public class _13_Compare_Largest {
    public static void main(String[] args) {
        String fruits[] = {"apple" , "mango" , "banana"};
        String largest = fruits[0];
        for ( int i= 1; i < fruits.length;i++) {
            if ( largest.compareTo(fruits[i]) < 0) {
                largest= fruits[i];
            }
        }
        System.out.println(largest);
    }
}
//Time complexity = O(n.N) N = No of String