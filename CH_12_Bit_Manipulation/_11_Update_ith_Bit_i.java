package CH_12_Bit_Manipulation;

public class _11_Update_ith_Bit_i {
    public static int ClearIthBit ( int n , int i) {
        int bitmask = ~( 1 << i) ;
        return n & bitmask;
    }

    public static int updateIthBit ( int n , int  i , int newBit) {
        n = ClearIthBit(n , i);

        int bitmask =  newBit << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10 , 2, 1));
        System.out.println(updateIthBit(10 , 1, 0));
    }
}
