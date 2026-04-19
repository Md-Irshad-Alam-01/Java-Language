package CH_11_Strings;

public class _PW_17_Question_1 {
    public static void main(String[] args) {
        String s = "physics";
        for ( int j = 2; j < 4 ; j++) {
            System.out.println(s.substring(j));
        }
    }
}
// this is because it is the form of substring(i,j)
//1st it run 2 to j++ and print
// and 2nd j becomes j++ so j = 3: so it run and print
// and again j++ then j become j = 4 and ot does not follow the rule of substring ( i , j) and then it stops