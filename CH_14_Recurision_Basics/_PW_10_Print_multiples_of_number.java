package CH_14_Recurision_Basics;

public class _PW_10_Print_multiples_of_number {
    public static void printMultiplesOfNumber ( int num , int mul) {

        //Base case
         if ( mul == 1 ) {
             System.out.println(num);
             return ;
         }

         printMultiplesOfNumber(num , mul -1) ;
         System.out.println(num * mul);
    }

    public static void main(String[] args) {
        int num = 5;
        int mul = 5;
        printMultiplesOfNumber(num , mul);
    }
}
