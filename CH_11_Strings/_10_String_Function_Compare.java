package CH_11_Strings;

public class _10_String_Function_Compare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if ( s1 == s2 ) {
            System.out.println("String are equal.");
        }
        else {
            System.out.println("Strings are not equal.");
        }

        if ( s1 == s3) {
            System.out.println("String are Equal.");
        }
        else {
            System.out.println("String are not equal");
        }
    }
}
