package CH_12_Bit_Manipulation;

public class _14_Clear_Range_Of_Bits {
    public static int clearRangeIthBit ( int n , int i , int j) {
        int  a = ((~0) << (j+1));
        int b = ( 1 << i) -1;
        int bitmask =  a | b;
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearRangeIthBit(10,2,4));
    }
}
