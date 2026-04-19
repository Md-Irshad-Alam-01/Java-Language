package CH_11_Strings;

public class _PW_32_Palindrome_i {
    public static boolean  palindrome(String str) {


        for ( int i = 0 ; i < str.length()/2 ; i++) {
            if ( str.charAt(i) != str.charAt(str.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(palindrome(str));
        String str1 = "madam";
        System.out.println(palindrome(str1));
        String str2 = "copy";
        System.out.println(palindrome(str2));
    }
}
