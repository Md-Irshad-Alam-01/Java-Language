package CH_13_OOPs;

class Students{
    String Name ;
    void setName ( String newName) {
        Name = newName;
    }
    int rollNo ;
    void setRollNo ( int newRollNo ) {
        rollNo = newRollNo;
    }
    float percentage;
    void calPercentage ( int phy , int chem , int maths , int urdu , int english) {
        percentage = ( phy + chem + maths + urdu + english) / 5;
    }
}

public class _2_Students_Details {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setName("Md Irshad Alam");
        System.out.println(s1.Name);
        s1.setRollNo( 32);
        System.out.println(s1.rollNo);
        s1.calPercentage(85,78,54,98,88);
        System.out.println(s1.percentage);
    }

}
