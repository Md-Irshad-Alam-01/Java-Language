package CH_11_Strings;

public class _PW_7_CompareTo {
    public static void main(String[] args) {
        /*
        example
        if str == gtr : 0         or    0
           str > gtr : give > 0   or    +ve
           str < gtr : give < 0   or    -ve
         */

        //number 1 (str == gtr)
        String str = "Hello";
        String gtr = "Hello";
        System.out.println(str.compareTo(gtr));


        // number 2  (str > gtr )
        String str1 = "Hello";
        String gtr1 = "Dello";
        System.out.println(str1.compareTo(gtr1));


        // number 3  (str < gtr)
        String str2 = "Hello";
        String gtr2 = "Zello";
        System.out.println(str2.compareTo(gtr2));
    }
}
