package CH_11_Strings;

public class _PW_20_String_are_Immutability {
    public static void main(String[] args) {
        String s = "Hello";
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
    }
}

//Immutable means once String is crested in memory then it cannot be changed in place
//if we want to change then we need to create a new String.