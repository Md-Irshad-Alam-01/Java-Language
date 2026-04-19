package CH_1_Variables_And_Datatypes;

import java.util.Scanner;

public class _21_Type_Casting_Float_to_Int_i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        int b = (int)a;
        System.out.println(b);
    }
}
