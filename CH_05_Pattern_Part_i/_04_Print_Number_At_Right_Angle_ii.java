package CH_5_Pattern_Part_i;

public class _4_Print_Number_At_Right_Angle_ii {
    public static void main(String[] args) {
        for ( int i = 1; i <= 5; i++) {
            for ( int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
