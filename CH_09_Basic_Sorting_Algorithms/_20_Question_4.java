package CH_9_Basic_Sorting_Algorithms;

public class _20_Question_4 {
    public static void partition ( int num[]) {
        int left = 0 ;
        int right = num.length-1;
        while (left < right) {
            while ( num[left] < 0 ) left++;
            while ( num[right] >= 0) right--;
            if (left < right) {
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void printArr ( int num[]) {
        for ( int i  =  0 ;  i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Given an array of size N containing only 0s , 1s, 2s." +
                " sort the array in ascending order");
        System.out.println();
        int num[] = {-13,20, 7,0,-4,-13,11,-5,-13};
        partition(num);
        printArr(num);
    }
}
