package CH_12_Bit_Manipulation;

public class _9_Set_ith_Bit {
    public static int SetIthBit ( int n , int i) {
        int bitmask = 1 << i;
        return  n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(SetIthBit(10 , 2));
        System.out.println(SetIthBit(10 , 3));
    }
}
