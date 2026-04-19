package CH_17_Backtracking;

public class _PW_07_Permutations {
    public static void printPermutations ( String str, String t) {
        if(str.isEmpty()) {
            System.out.println(t);
            return;
        }

        for ( int i = 0 ; i <str.length(); i++) {
            char ch = str.charAt(i);
            String left =  str.substring(0,i);
            String right =  str.substring(i+1);
            String rem =  left + right;
            printPermutations(rem ,t + ch);
        }
    }


    public static void main(String[] args) {
        String str = "abc";
        int num = 123;
        printPermutations(str,"");
        printPermutations(String.valueOf(num),"");
    }
}
