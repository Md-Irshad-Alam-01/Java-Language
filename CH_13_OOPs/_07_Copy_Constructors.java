package CH_13_OOPs;

class Student2 {
    String name ;
    int rollNo ;
    String password ;
    int marks[];

    //copy constructor
    Student2 (Student2 s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        this.marks = s1.marks;
        }

    Student2 () {
        marks = new int[3];
        System.out.println("Constructor is called ...");
    }

    Student2 ( String name ) {
        marks = new int[3];
        this.name = name ;
    }

    Student2 ( int roll) {
        marks = new int[3];
        this.rollNo =  roll;
    }
}

public class _7_Copy_Constructors {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.name = "Irshad";
        s1.rollNo = 032;
        s1.password = "xyz";
        s1.marks[0] = 85;
        s1.marks[1] = 78;
        s1.marks[2] = 77;

        for ( int i = 0 ; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }
    }

}
