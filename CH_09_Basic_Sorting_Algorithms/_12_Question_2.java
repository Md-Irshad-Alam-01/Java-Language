package CH_9_Basic_Sorting_Algorithms;

public class _12_Question_2 {
    public static void sortFruitsName ( String fruits[]) {
        for ( int i = 0 ; i < fruits.length-1; i++) {
            int min_Index = i;
            for ( int j = i+1 ; j < fruits.length; j++) {
                if (fruits[j].compareTo(fruits[min_Index]) < 0) {
                    min_Index = j;
                }
            }
            //swap
            String temp = fruits[i];
            fruits[i] = fruits[min_Index];
            fruits[min_Index] = temp;
        }
    }
    public static void printArr ( String fruits[]) {
        for ( int i = 0 ; i < fruits.length; i++) {
            System.out.print(fruits[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Given an array of names of the fruits " +
                "you are supposed to sort it in lexicographical order using the selection order");
        String fruits[] = {"Papaya", "Lime" , "Watermelon" , "Apple" , "Mango" , "Kiwi"};
        sortFruitsName(fruits);
        printArr(fruits);
    }
}
