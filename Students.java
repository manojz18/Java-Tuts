public class Students extends Person{
    String studentID;

    Students(String firstName, String lastName, String studentID){
        super(firstName, lastName);
        this.studentID = studentID;
    }

    void showStudentInfo(){
        showFullName();
        System.out.println("Student ID: " + studentID);
    }
}
