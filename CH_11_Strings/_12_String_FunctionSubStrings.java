package CH_11_Strings;

public class _12_String_FunctionSubStrings {
    public static String substring ( String str , int si , int ei) {
        String subStr  = "";
        for ( int i = si; i < ei ; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        String str = ("Hello World");
        System.out.println(substring(str,0,5));

        //or another method that we can direct print
        //we don't need to create any type of function
        System.out.println(str.substring(0,8));
    }
}
