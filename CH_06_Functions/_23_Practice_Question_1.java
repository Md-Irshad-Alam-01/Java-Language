package CH_6_Functions;

public class _23_Practice_Question_1 {
    public static int average ( int a, int b, int c) {
        int average = ( a+b+c) /3;
        return average;
    }

    public static void main(String[] args) {
        System.out.println(" Write a Java method to compute the average of three numbers.");
        System.out.println( "Your average of three number is "+average(5,6,13));
    }
}
