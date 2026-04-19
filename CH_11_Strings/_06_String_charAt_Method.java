package CH_11_Strings;

public class _6_String_charAt_Method {
    // charAt function which help to find any character at any time
    public static void main(String[] args) {
        String firstName = "Md ";
        System.out.println("Enter your first name = " +firstName);
        String middleName = "Irshad ";
        System.out.println("Enter your middle name = "+middleName);
        String lastName = "Alam";
        System.out.println("Enter your last name = "+lastName);
        String fullName = firstName+middleName+lastName;
        System.out.println("Your full name is = "+fullName);

        System.out.println(fullName.charAt(3));
    }
}
