package CH_11_Strings;

public class _PW_24_Java_StringBuilder_Class_ii {
    // we use StringBuilder to solve the immutable problem
    /*
        we can change name easily with the help of setBuilder
     */

    //  .append() means add text to the end


    public static void main(String[] args) {
        StringBuilder str =  new StringBuilder("Hello ");
        System.out.println(str);
        str.setCharAt(0,'m');
        System.out.println(str);
    }
}
