package CH_14_Recurision_Basics;

public class _18_Binary_String_Problem_2 {
    public static void binaryProb ( int num , int lastPlace , String str) {

        //Base case
        if ( num == 0) {
            System.out.println(str);
            return;
        }

        binaryProb(num - 1 , 1 , str+"1");
         if ( lastPlace == 1) {
             binaryProb(num - 1 , 0 , str+"0");
         }
    }

    public static void main(String[] args) {
        System.out.println("Question is = Print all binary String of size N without consecutive zeros.");

        binaryProb(3,1,"");
    }
}
