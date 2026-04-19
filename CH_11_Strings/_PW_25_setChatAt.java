package CH_11_Strings;

public class _PW_25_setChatAt {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
        str.setCharAt(0,'m');
        System.out.println(str);
        str.append(10);
        System.out.println(str);
    }
}
