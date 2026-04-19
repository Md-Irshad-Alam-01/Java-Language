package CH_11_Strings;

public class _5_String_Concatenate {
    // concatenate means add two things
    public static void main(String[] args) {
        String firstName = "Md ";
        System.out.println("Enter your first name = " +firstName);
        String middleName = "Irshad ";
        System.out.println("Enter your middle name = "+middleName);
        String lastName = "Alam";
        System.out.println("Enter your last name = "+lastName);
        String fullName = firstName+middleName+lastName;
        System.out.println("Your full name is = "+fullName);
    }
}
