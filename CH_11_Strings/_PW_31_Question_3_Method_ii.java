package CH_11_Strings;

public class _PW_31_Question_3_Method_ii {
    public static void main(String[] args) {
        System.out.println("Question is : Given an array the task is to toggle all the characters of the string i.e " +
                "to convert upper case to lower case and vice versa");

        // we use subString
        String str = "PHySicS";
        System.out.println(str);
        //StringBuilder sb = new StringBuilder(str);
        for ( int i = 0 ; i < str.length() ; i++) {
            boolean flag = true;
            char ch = str.charAt(i);
            if ( ch == ' ') {
                continue;
            }
            int ascii = (int) ch;
            if (ascii >= 97) flag = false;
            if ( flag == true ) {
                ascii += 32;
                char dh = (char)ascii;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }

            else {
                ascii -= 32;
                char dh = (char)ascii;
                str = str.substring(0,i) +dh + str.substring(i+1);
            }
        }
        System.out.println(str);
    }
}
