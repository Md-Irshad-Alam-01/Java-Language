package CH_14_Recurision_Basics;

public class _PW_29_Check_Sting_is_Palindrome_or_not_i {
    public static String palindromeOrNot ( String str , int idx ) {

        if (idx == str.length()) {
            return "";
        }

        String smallAns = palindromeOrNot(str, idx + 1);
        String ans = smallAns + str.charAt(idx);

        return ans;
    }


    public static void main(String[] args) {
        String str = "dad";
        String rev = palindromeOrNot(str , 0);
         if ( rev.equals(str)) {
             System.out.println("This is Palindrome");
         }
         else {
             System.out.println("This is not Palindrome");
         }
    }
}
