package CH_15_Divide_Conquer;

public class _PW_17_Distribute_Chocolate {
    public static int DistributeChocolate ( int arr[] , int m) {

        if (arr.length < m) {
            return -1;
        }

        int ans = 0 ;
        int start =  1;
        int end = (int)1e9;

        while ( start <= end) {
            int mid = start + ( end - start) /2;

            if ( isDivisionPossible (arr, m , mid)) {
                ans = mid;
                end = mid-1;
            }
            else {
                start = mid +1;
            }
        }
        return ans;
    }

    public static boolean isDivisionPossible( int arr[], int m , int maxChocoAllowed) {
        int numOfStudents = 1;
        int choco = 0 ; // number of choco current students
        for ( int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > maxChocoAllowed) {
                return false;
            }
            if (choco + arr[i] <= maxChocoAllowed) {
                choco += arr[i];
            }
            else {
                numOfStudents++;
                choco = arr[i];
            }
        }
        if (numOfStudents > m) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 5,3,1,4,2};
        int m = 3;
        System.out.println(DistributeChocolate(arr,m));
    }
}
