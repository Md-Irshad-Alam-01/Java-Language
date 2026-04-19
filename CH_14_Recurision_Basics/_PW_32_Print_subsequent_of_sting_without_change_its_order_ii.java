package CH_14_Recurision_Basics;

public class _PW_32_Print_subsequent_of_sting_without_change_its_order_ii {
    public static void printSubsequentString ( String str , String currAns) {
        if (str.length() == 0) {
            System.out.println(currAns);
            return;
        }

        char curr = str.charAt(0);  //a
        String remaningString = str.substring(1);

        printSubsequentString( remaningString , currAns +curr);

        printSubsequentString(remaningString,currAns);
    }

    public static void main(String[] args) {
        printSubsequentString("abc" , "");
    }
}
