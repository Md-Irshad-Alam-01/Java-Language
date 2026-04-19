package CH_11_Strings;

public class _PW_34_Palindrome_iii {

    public static void palindrome(String str ){

        int i = 0;
        int j = str.length() -1 ;

        boolean flag = true ; //palindrome
        while ( i < j) {
            if ( str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if ( flag == true) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome...");
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
