package CH_7_Pattern_Part_ii;

public class _2_Inverted_Rotated_Right_Angle {
    public static void InvertedRightAngle (int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main (String[] args){
            InvertedRightAngle(5);
    }
}