package CH_11_Strings;

public class _PW_28_deleteCharAt {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("HelloWorld");
        str.deleteCharAt(4);
        System.out.println(str);
    }
}
