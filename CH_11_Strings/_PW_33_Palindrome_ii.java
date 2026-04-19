package CH_11_Strings;

public class _PW_33_Palindrome_ii {
    public static void palindrome(String str) {

        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        String s = gtr +"";
        if ( str.equals(s)) {
            System.out.println("Palindrome");
        }
        else  {
            System.out.println("Not palindrome...");
        }
    }

    public static void main(String[] args) {
        String str = "abcdcba";
        palindrome(str);
        String str1 =  "madam";
        palindrome(str1);
        String str2 = "roadcar";
        palindrome(str2);

    }
}
