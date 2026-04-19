package CH_12_Bit_Manipulation;

public class _13_Clear_Last_ith_Bit {
    public static int ClearLastIthBit(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(ClearLastIthBit(15,2));
    }
}
