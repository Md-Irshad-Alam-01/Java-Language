package CH_11_Strings;

public class _PW_35_Question_4 {
    public static boolean isPalindromic ( String s) {

        int i = 0;
        int j =  s.length() -1;
        while (i < j) {
            if ( s.charAt(i) != s.charAt(j)) {
                return  false ;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Question is : Given a String s , return the number of palindromic substring in it. ");

        String str = "abbd";
        int count = 0 ;
        for ( int i =  0;  i < str.length(); i++) {
            for ( int j = i+1; j <= str.length(); j++) {
                if ( isPalindromic(str.substring(i,j))== true ) {
                    System.out.print(str.substring(i,j) +" ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("The number of palindromic substring is "+ count);
    }
}
