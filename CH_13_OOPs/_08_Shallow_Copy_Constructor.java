package CH_13_OOPs;

//Shallow copy means creates a copy of an existing object by copying
// its field values as they are (references are copied, not cloned).

class Student3 {
    String name ;
     int marks ;
     int rollNo ;

     //Parameterized Constructor
    Student3 ( String name , int marks , int rollNo) {
        this.name = name ;
        this.marks = marks ;
        this.rollNo = rollNo;
    }

    //Copy Constructor
    Student3 (Student3 s) {
        this.name = s.name;
        this.marks = s.marks;
        this.rollNo = s.rollNo;
    }
}

public class _8_Shallow_Copy_Constructor {
    public static void main(String[] args) {
        Student3 s1 = new Student3("Irshad ", 88  , 32);

        Student3 s2 = new Student3(s1) ;

        System.out.println("Original Student = " +s1.name + " " + s1.marks + " " + s1.rollNo);
        System.out.println("Copied Student = " + s2.name + " " + s1.marks + " " + s2.rollNo);

        //Modify original object's data
        s1.name = "Changed name ";

        System.out.println("\nAfter modifying s1 = ");
        System.out.println("Original Student = " +s1.name + " " + s1.marks + " " + s1.rollNo);
        System.out.println("Copied Student = " + s2.name + " " + s1.marks + " " + s2.rollNo);
    }
}
