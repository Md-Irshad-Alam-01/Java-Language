package CH_13_OOPs;

class Student5 {
    String name;
    int roll;
    static String schoolName ;
    void setName (String name ) {
        this.name = name ;
    }
    String getName () {
        return this.name;
    }
}

public class _23_Static_Keyword {
    public static void main(String[] args) {
        Student5 s1 = new Student5();
        s1.schoolName = "SDV";
        s1.roll = 32;
        s1.name = "Irshad";

        Student5 s2 = new Student5();
        System.out.println(s2.schoolName);
        System.out.println();

        Student5 s3 = new Student5();
        s3.schoolName = "SFS";

    }
}
