package CH_11_Strings;

public class _15_Convert_1se_Letter_Into_Uppercase {
    public static String convertIntoUppercase ( String str) {
        StringBuilder sb =new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for ( int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "hi , i am md irshad alam...";
        System.out.println(convertIntoUppercase(str));
    }
}