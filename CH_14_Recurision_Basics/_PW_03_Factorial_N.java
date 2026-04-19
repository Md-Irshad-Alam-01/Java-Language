package CH_14_Recurision_Basics;

public class _PW_3_Factorial_N {
    public static int findFact ( int num ) {

        //Base case
         if (num == 0 ) {
             return 1;
         }

         int numMinus1Fact = findFact(num -1) ;
         int fact = num *numMinus1Fact;

         return fact;
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(findFact(num));
    }
}
