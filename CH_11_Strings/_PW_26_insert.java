package CH_11_Strings;

public class _PW_26_insert {
    //  insert(idx, ch)  = means add
    public static void main(String[] args) {
        StringBuilder str =new StringBuilder("Hello") ;
        str.insert(2,'y');
        System.out.println(str);
    }
}
