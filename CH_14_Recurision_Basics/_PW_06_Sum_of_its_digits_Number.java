package CH_14_Recurision_Basics;

public class _PW_6_Sum_of_its_digits_Number {
   public static int sumOfItsDigitsNumber ( int num ) {

       //Base case
       if ( num >= 0 && num <=9) {
           return num ;
       }

       int lastDigit = num % 10;
       int firstDigit = num / 10;

       int smallAns = sumOfItsDigitsNumber(firstDigit);

       int ans = lastDigit + smallAns;
       return ans;
   }

    public static void main(String[] args) {
        int num = 2325;
        System.out.println(sumOfItsDigitsNumber(num));
    }

}
