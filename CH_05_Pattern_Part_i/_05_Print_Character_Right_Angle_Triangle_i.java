package CH_5_Pattern_Part_i;

public class _5_Print_Character_Right_Angle_Triangle_i {
    public static void main(String[] args) {
        char ch = 'a';
        for ( int i = 1; i <= 5; i++) {
            for ( int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
