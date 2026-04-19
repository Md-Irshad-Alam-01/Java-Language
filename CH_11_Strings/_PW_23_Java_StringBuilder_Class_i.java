package CH_11_Strings;

public class _PW_23_Java_StringBuilder_Class_i {
    // we use StringBuilder to solve the immutable problem
    /*
         declaration of StringBuilder
         (i) StringBuilder()
         (ii) StringBuilder(String str);
         (iii) StringBuilder ( int capacity)
     */

    //  .append() means add text to the end


    public static void main(String[] args) {
        StringBuilder str =  new StringBuilder("Hello ");
        str.append("World");
        System.out.println(str);
    }
}
