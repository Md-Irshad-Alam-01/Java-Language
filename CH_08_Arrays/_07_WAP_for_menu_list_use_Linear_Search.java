package CH_8_Arrays;

public class _7_WAP_for_menu_list_use_Linear_Search {
    public static int menuList ( String name[] , String key) {
        for ( int i = 0; i < name.length; i++) {
            if ( name[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Write a program for making a menu list and use linear search");
        String name[] = {"Samosa" , "Milk Shake" , "Pizza" , "Momo" , "Cold Drink" , "Sandwich"};
        String key = "Momo";
        int index = menuList(name , key);
        if ( index == -1) {
            System.out.println("Menu  are not found in the Menu list");
        }
        else {
            System.out.println("Menu are found in the list at index = " +index);
        }
    }
}
