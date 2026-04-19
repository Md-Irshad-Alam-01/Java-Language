package CH_12_Bit_Manipulation;

public class _12_Update_ith_Bit_ii {
    public static int SetIthBit ( int n , int i) {
        int bitmask = 1 << i;
        return  n | bitmask;
    }

    public static  int ClearIthBit ( int n , int i) {
        int bitmask =  ~( 1 << i);
        return n & bitmask;
    }

    public static int updateIthBit (int n, int i , int newBit ) {
        if ( newBit == 0) {
            return ClearIthBit(n , i);
        }
        else {
            return SetIthBit(n , i);
        }
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10 , 2, 1));
        System.out.println(updateIthBit(10 , 1, 0));
    }
}
