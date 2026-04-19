package CH_14_Recurision_Basics;

public class _PW_28_WAP_to_print_reverse_of_a_String_ii {
    public static String reverseString ( String str ) {

        if( str.length() == 0) {
            return "";
        }

        String smallAns = reverseString(str.substring(1));
        return smallAns + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Mango";
        System.out.println(reverseString(str ));
    }
}
