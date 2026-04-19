package CH_11_Strings;

public class _PW_19_Interning_and_New {
    public static void main(String[] args) {
        String s = "Hello";
        String x = "Hello";
        x = "Hey!...";
        System.out.println(s);
        System.out.println(x);

        String  y = new String("Hello");
        System.out.println(y);
    }
}

// s and x are equal in output .and they are pointing same address
// s and y are equal in output. but they are pointing different address
