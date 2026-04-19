package CH_14_Recurision_Basics;

public class _PW_35_Num_Pad_print_possible_letter_of_that_number {
    public static void numPadPrintCombinationLetterOfThatNumber (String digit , String keypad[] , String result) {

        if (digit.length() == 0) {
            System.out.print(result + " ");
            return;
        }

        int currNum = digit.charAt(0) -'0' ;  //0

        String currChoices = keypad[currNum];

        for (int i = 0; i < currChoices.length(); i++) {
            numPadPrintCombinationLetterOfThatNumber(digit.substring(1), keypad, result + currChoices.charAt(i));
        }
    }


    public static void main(String[] args) {
        String digit = "23";

        String keypad[] = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
        numPadPrintCombinationLetterOfThatNumber(digit,keypad,"");
    }
}
