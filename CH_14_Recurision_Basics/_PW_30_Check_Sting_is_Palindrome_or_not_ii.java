package CH_14_Recurision_Basics;

public class _PW_30_Check_Sting_is_Palindrome_or_not_ii {
    public static boolean palindromeOrNot ( String str , int left , int right) {

        if ( left >= right ) {
            return true;
        }

        return  str.charAt(left) == str.charAt(right) && palindromeOrNot(str , left+1 , right-1);
    }

    public static void main(String[] args) {
        String str = "mom";
        System.out.println(palindromeOrNot(str, 0 , str.length() -1));
    }
}
