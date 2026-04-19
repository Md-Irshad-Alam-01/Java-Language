package CH_14_Recurision_Basics;

public class _PW_27_WAP_to_print_reverse_of_a_String_i {
    public static String reverseString (String str , int idx) {

        if ( idx == str.length()) {
            return " " ;
        }

        String smallAns = reverseString(str , idx +1) ;

        return smallAns + str.charAt(idx);
    }

    public static void main(String[] args) {
         String str = "apple";
        System.out.println(reverseString(str,0));

    }
}
