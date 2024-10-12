public class Student extends Person {

    private String studentNumber;

    public Student(String studentNumber, String lastName, String firstName) {
        super(firstName, lastName);
        this.studentNumber = studentNumber;
    }

    public String toString(){
        return super.toString() + "Student [studentNumber =" + studentNumber +"]";
    }
}
