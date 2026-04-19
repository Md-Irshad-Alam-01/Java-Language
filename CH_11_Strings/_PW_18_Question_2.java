package CH_11_Strings;

public class _PW_18_Question_2 {
    public static void main(String[] args) {
        System.out.println("Question is : Given a string s , print all the substring of s." +
                " Input s =  (abcd)  and Output = a ab abc abcd b bc bcd c cd d");

        String s = "abcd";
        for ( int i  = 0; i <= 3; i++) {
            for ( int j = i+1 ; j <= 4 ; j++) {
                System.out.println(s.substring(i,j) +" ");
            }
        }
    }
}
