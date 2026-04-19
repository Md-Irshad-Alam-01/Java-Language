package CH_8_Arrays;

public class _24_Practice_Question_1 {
    public static boolean findArrayAppearsTwice ( int arr[] ) {
        for ( int i = 0; i < arr.length; i++) {
            int first = arr[i];
            for ( int j = i+1; j < arr.length; j++) {
                int second = arr[j];
                if ( first == second ) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,3,2,2,3,4,5};
        System.out.println(findArrayAppearsTwice(arr));
    }
}
