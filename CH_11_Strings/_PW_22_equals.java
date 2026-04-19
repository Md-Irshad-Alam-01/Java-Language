package CH_11_Strings;

public class _PW_22_equals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        //use equals()
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));


    }
}
//s1 and s2 are equal because s1 and s2 point same address
// and s1 and s3 are not equal because they both have different address
//same as s2 and s3 are not equal
// but when we use .equals() then it correct and it forms overridden