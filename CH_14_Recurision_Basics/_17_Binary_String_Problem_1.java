package CH_14_Recurision_Basics;

public class _17_Binary_String_Problem_1 {
    public static void binaryProblem ( int num , int lastPlace , String str) {

        //Base case
        if ( num == 0 ) {
            System.out.println(str);
            return ;
        }

        //Work

        binaryProblem(num - 1 , 0 , str + "0");
         if ( lastPlace == 0) {
             binaryProblem(num - 1 , 1 , str + "1");
         }
    }

    public static void main(String[] args) {

        System.out.println("Question is = Print all binary String of size N without consecutive ones.");
        binaryProblem(3,0,"");
    }
}
