package CH_13_OOPs;

class Student {
    private String name ;
    private int age;

    // Setter
    public void setName(String name) {
        this.name = name ;
    }
    public void setAge ( int age) {
        this.age = age;
    }

    //Getter
    public String getName() {
        return name ;
    }
    public int getAge() {
        return age;
    }
}

public class _5_Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Irshad");
        s1.setAge(22);

        System.out.println("Name = " + s1.getName());
        System.out.println("Age = " + s1.getAge());
    }
}
