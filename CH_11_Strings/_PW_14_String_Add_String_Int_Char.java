package CH_11_Strings;

public class _PW_14_String_Add_String_Int_Char {
    public static void main(String[] args) {

        //String + String

        String str = "abc";
        str += "def";
        System.out.println("Your String + String function /n");
        System.out.println(str);


        //String + int

        String str1 = "abc";
        str1 += 10;
        System.out.println("Your String + Int function/n");
        System.out.println(str1);

        System.out.println("def" + 10 + 20);
        System.out.println("def" + (10 + 20));
        System.out.println(10 + 20 +"def");


        // String + Char

        String str2 = "abc";
        str2 += 'd';
        System.out.println("Your String + Char function ");
        System.out.println(str2);
    }
}
