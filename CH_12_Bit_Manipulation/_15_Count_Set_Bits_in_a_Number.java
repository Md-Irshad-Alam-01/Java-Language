package CH_12_Bit_Manipulation;

public class _15_Count_Set_Bits_in_a_Number {
    public static int CountSetBit ( int n) {
        int count = 0;
        while (n > 0) {
            if (( n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count ;
    }

    public static void main(String[] args) {
        System.out.println(CountSetBit(15));
        System.out.println(CountSetBit(16));
    }
}
