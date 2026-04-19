package CH_13_OOPs;

// A deep copy constructor creates a new object and duplicates allfields
//completely, including creating new copies of any reference objects.


class Student4 {
    String name ;
    int marks[];

    //Parametrized constructor
    Student4 (String name , int marks[]) {
        this.name = name ;
        this.marks = marks;
    }

    //Deep copy constructor
    Student4 (Student4 s) {
        this.name = s.name;
        this.marks = new int [s.marks.length];
        for ( int i = 0 ;  i < s.marks.length ; i++) {
            this.marks[i] = s.marks[i];
        }
    }

    void display () {
        System.out.print("Name = " + name + ", Marks = ");
        for ( int mark :marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}

public class _9_Deep_Copy_Constructor {
    public static void main(String[] args) {
        int marks [] ={ 45,58,59};
        Student4 s1 = new Student4("Irshad", marks);

        Student4 s2 = new Student4(s1);

        System.out.println("Before modification");
        s1.display();
        s2.display();

        s1.marks[0] = 100;

        System.out.println("\nAfter modifying s1 marks = ");
        s1.display();
        s2.display();
    }

}
