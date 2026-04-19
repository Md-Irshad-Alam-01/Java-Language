package CH_14_Recurision_Basics;

public class _PW_25_Remove_all_a_from_String_i {
    public static String removeAllAFromString ( String str , int idx) {

        if ( idx == str.length()) {
            return  " ";
        }

        String smallAns = removeAllAFromString(str , idx +1);
        char ch = str.charAt(idx);

        if ( ch != 'a') {
            return ch +smallAns;
        }
        else {
            return smallAns;
        }
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "wallah ";
        System.out.println(removeAllAFromString(str1,0));
        System.out.println(removeAllAFromString(str2, 0));
    }
}
