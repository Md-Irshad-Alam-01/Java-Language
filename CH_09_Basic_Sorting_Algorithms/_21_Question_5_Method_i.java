package CH_9_Basic_Sorting_Algorithms;

public class _21_Question_5_Method_i {
    public static void sort_012 ( int num[]) {
        int count_0 = 0 , count_1 = 0,  count_2 = 0;
        for ( int j : num) {
            if ( j ==  0) {
                count_0++;
            }
            else if ( j == 1) {
                count_1++;
            }
            else {
                count_2++;
            }
        }
        int k = 0 ;
        while (count_0 > 0) {
            num[k++] = 0;
            count_0--;
        }
        while (count_1 > 0) {
            num[k++] = 1;
            count_1--;
        }
        while (count_2 > 0) {
            num[k++] = 2;
            count_2--;
        }
    }

    public static void printArr( int num[]) {
        for ( int i  = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Given an array of positive and negative integers, segregate" +
                " them in linear time and constant space." +
                " The output should print all negative number followed by positive number ");
        int num[] = {0,2,1,2,0,0};
        sort_012(num);
        printArr(num);
    }
}
