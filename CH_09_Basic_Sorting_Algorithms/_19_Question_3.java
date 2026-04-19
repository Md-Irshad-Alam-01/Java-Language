package CH_9_Basic_Sorting_Algorithms;

public class _19_Question_3 {
    public static void sortArray ( int num []) {
        int n =  num.length;
        if (n <= 1) {
            return;
        }

        int x = -1;
        int y = -1;
        // Step 1: Find first violation
        for (int i = 0; i < n - 1; i++) {
            if (num[i] > num[i + 1]) {
                if (x == -1) {
                    x = i;
                    y = i + 1;
                } else {
                    y = i + 1;
                    break;
                }
            }
        }

        // Step 2: Swap them back
        if (x != -1 && y != -1) {
            int temp = num[x];
            num[x] = num[y];
            num[y] = temp;
        }
    }

    public static void printArr ( int num[]) {
        for ( int i = 0; i < num.length; i++) {
            System.out.print(num[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Given an array where all its element are sorted in increasing order" +
                " except two swapped element , sort it in linear time . Assume there are no duplicates int the array.");
        System.out.println();
        int num[] = {10,5,6,7,8,9,3};
        sortArray(num);
        printArr(num);
    }
}
