package CH_1_Variables_And_Datatypes;

import java.util.Scanner;

public class _12_Input_In_Java_With_String_i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);
    }
}

//this is because sc.next() only print first word