import programmeClasses.Student;
import programmeClasses.Subject;

public class Main {

    public  static  void main(String[] args){
        System.out.println("Student grading programme running");
        String[] subjectNames = {"Maths", "Geography", "English"};
        Student conor = new Student("Conor Heffernan", subjectNames);
        conor.setGrade(1, 5, 30.2);
        String conorsGrades = conor.getStudentGrades();

        System.out.println(conorsGrades);
    }

}
