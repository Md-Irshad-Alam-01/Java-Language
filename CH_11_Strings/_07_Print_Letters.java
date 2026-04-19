package CH_11_Strings;

public class _7_Print_Letters {
    public static void printLetters ( String str ) {
        for ( int i = 0 ; i < str.length() ; i++) {
            System.out.print(str.charAt(i) +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String firstName = "Md ";
        System.out.println("Enter your first name = " +firstName);
        String middleName = "Irshad ";
        System.out.println("Enter your middle name = "+middleName);
        String lastName = "Alam";
        System.out.println("Enter your last name = "+lastName);
        String fullName = firstName+middleName+lastName;
        System.out.println("Your full name is = "+fullName);

        printLetters(fullName);
    }
}
