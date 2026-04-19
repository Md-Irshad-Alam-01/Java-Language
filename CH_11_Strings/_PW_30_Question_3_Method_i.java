package CH_11_Strings;

import java.util.*;

public class _PW_30_Question_3_Method_i {
    public static void main(String[] args) {
        System.out.println("Question is : Given an array the task is to toggle all the characters of the string i.e " +
                "to convert upper case to lower case and vice versa");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String name = ");

        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        // toggle PHysIcS == phYSiCs
        for ( int i = 0 ; i < str.length(); i++) {
            // check alphabet small or capital
            boolean flag = true;
            char ch = str.charAt(i);
            if ( ch == ' ') {
                continue;
            }
            int ascii = (int)ch;
            if ( ascii >= 97)  flag = false ;
            if ( flag == true ) {
                ascii += 32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }

            else { // small
                ascii -= 32;
                char dh = (char)ascii;
                str.setCharAt(i, dh);

            }

        }
        System.out.println(str);

    }
}
