package CH_13_OOPs;

class Student1 {
    String name ;
    int rollNo ;

    //non-parametrized
    Student1() {
        System.out.println("Constructor is called...");
    }

    //parametrized
    Student1 (String name ) {
        this.name = name ;
    }

    Student1( int rollNo) {
        this.rollNo =  rollNo;
    }
}

public class _6_Constructors {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1("Irshad");
        System.out.println("Name = " + s2.name);
        Student1 s3 = new Student1(123);
        System.out.println("Roll number = " + s3.rollNo);
    }
}
