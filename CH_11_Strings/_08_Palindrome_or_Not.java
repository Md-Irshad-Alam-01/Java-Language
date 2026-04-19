package CH_11_Strings;

public class _8_Palindrome_or_Not {
    public static boolean palindrome ( String str ) {

        int n = str.length();
        for (int i = 0 ; i < n/2 ; i++) {

            // not a palindrome

             if ( str.charAt(i) != str.charAt(n-1-i)) {
                 return false ;
             }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println("Enter your palindrome = "+str);
        if (palindrome(str)) {
            System.out.println("This number is palindrome.");
        }
        else {
            System.out.println("This number is not palindrome.");
        }
    }
}
