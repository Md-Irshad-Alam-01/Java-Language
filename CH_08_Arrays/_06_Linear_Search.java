package CH_8_Arrays;

public class _6_Linear_Search {
    public static int linearSearch ( int num [] , int key) {
        for ( int i = 0; i< num.length; i++) {
            if ( num[i] == key ){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 1,3,4,6,7,2} ;
        int key = 7;
        int index = linearSearch(num, key);
        if ( index == -1) {
            System.out.println("Key not found");
        }
        else {
            System.out.println("Your key at index = " +index);
        }
    }
}
