package CH_11_Strings;

public class _PW_21_Performance_Of_String {
    public static void main(String[] args) {
        String str = "";
        for ( int i = 1; i <=10 ; i++) {
            str += i;
        }
        System.out.println(str);
    }
}

//but in memory it actually runs like this
/*
        ""
        "1"
        "12"
        "123"
        "1234"
        "12345"
        "123456"
        "1234567"
        "12345678"
        "123456789"
        "12345678910"
 */