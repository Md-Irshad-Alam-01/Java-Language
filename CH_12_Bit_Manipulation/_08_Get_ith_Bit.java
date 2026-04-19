package CH_12_Bit_Manipulation;

public class _8_Get_ith_Bit {
    //Get ith bit means
    public static int GetIthBit ( int n , int i) {
        int bitmask = 1 << i;
        if ( (n & bitmask) == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(GetIthBit(10, 2));
        System.out.println(GetIthBit(10,3));
    }
}
