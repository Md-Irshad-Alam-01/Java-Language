package CH_14_Recurision_Basics;

public class _PW_14_Find_Greatest_Common_Divisor_by_Euclid_Algorithm {
    public static int findGCDByEuclidAlgorithm ( int x , int y) {

        if ( y == 0) {
            return x;
        }
        return findGCDByEuclidAlgorithm(y ,x%y);
    }

    public static void main(String[] args) {
        int x = 24 ;
        int y = 15 ;
        System.out.println(findGCDByEuclidAlgorithm(x,y));
    }
}
