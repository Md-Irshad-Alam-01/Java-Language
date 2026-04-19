package CH_9_Basic_Sorting_Algorithms;

public class _22_Question_5_Method_ii {
    public static void swap ( int a[] , int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    public static void sort012 ( int a[]) {
        int low =0, mid = 0 , high = a.length-1;

        //explore the unknown region
        while (mid <= high ) {
            if (a[mid] == 0) {
                swap(a, mid, low) ;
                mid++;
                low++;
            }
            else if ( a[mid] == 1) {
                mid++;
            }
            else {
                swap(a,mid,high);
                high--;
            }
        }
    }

    public static void printArr(int a[]) {
        for( int i = 0 ; i <  a.length;  i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Given an array of positive and negative integers, segregate" +
                " them in linear time and constant space." +
                " The output should print all negative number followed by positive number ");
        int num[] = {0,2,1,2,0,0};
        sort012(num);
        printArr(num);
    }
}

