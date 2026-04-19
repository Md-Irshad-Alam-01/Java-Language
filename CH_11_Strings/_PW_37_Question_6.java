package CH_11_Strings;

public class _PW_37_Question_6 {
    public static void main(String[] args) {

        System.out.println("Question is : The String should be compressed such that consecutive duplicates of character are " +
                "replaced with the character and followed by the number of consecutive duplicates.");

        String str = "aaabbbbccddddeeeee";
        String ans = "";
        int count = 1;

        for ( int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if ( curr == prev) {
                count++;
            }
            else {
                ans += prev;
                if(count > 1){
                    ans += count;
                }
                count = 1;
            }
        }

        ans += str.charAt(str.length() - 1);
        if (count > 1) {
            ans += count;
        }

        System.out.println("Compressed String: " + ans);
    }
}
