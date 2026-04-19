package CH_14_Recurision_Basics;

public class _PW_26_Remove_all_a_from_String_ii {
    public static String removeAFromString ( String str ) {

        if (str.length() == 0) {
            return " ";
        }

        String smallAns = removeAFromString(str.substring(1));

        char currChar = str.charAt(0);

        if (currChar != 'a') {
            return currChar+smallAns;
        }
        else {
            return smallAns;
        }
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "wallah ";

        System.out.println(removeAFromString(str1));
        System.out.println(removeAFromString(str2));
    }
}
