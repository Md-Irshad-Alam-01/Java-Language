package CH_15_Divide_Conquer;

public class _PW_18_Race_Track {
    public static int RaceCar ( int arr[] , int k) {
        if ( k > arr.length) {
            return -1;
        }

        int start = 0;
        int end = (int)1e9;

        int ans = -1;

        while (start <=  end) {
            int mid = start + (end-start)/2;
            if(isPossible (arr,k,mid)) {
                ans = mid;
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }

    public static boolean isPossible( int arr[] , int k , int distance) {
        int kidsPlace = 1;
        int lastKid = arr[0];

        for ( int i = 1; i < arr.length ; i++) {
            if( arr[i] - lastKid >= distance) {
                kidsPlace ++;
                lastKid= arr[i];
            }
        }
        return kidsPlace >= k;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,8,9} ;
        int k1 = 2;
        int k2 = 3;
        System.out.println(RaceCar(arr,k1));
        System.out.println(RaceCar(arr,k2));
    }
}
