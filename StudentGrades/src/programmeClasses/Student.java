package programmeClasses;

import java.util.Arrays;

public class Student {

    public String name;
    public Subject[] subjects = new Subject[3];

    public  Student(String studentName, String[] subjectNames){
        //[ "Maths" , "Geography" , "History"]
        name = studentName;
        Subject subject1 = new Subject(subjectNames[0]);
        Subject subject2 = new Subject(subjectNames[1]);
        Subject subject3 = new Subject(subjectNames[2]);

        subjects[0] = subject1;
        subjects[1] = subject2;
        subjects[2] = subject3;
    }

    /*
    * used to get string representation of all the students grades
    *
    * getStudentGrades() ->
    *
    * Conor Heffernan Grades
    * Maths : {80.2,70.3, 99.5}
    * Geography : {50.2,70.3, 99.5}
    * History : {70.2,9.3, 99.5}
    *
    * */
    public String getStudentGrades(){
        Subject subject1 = subjects[0];
        Subject subject2 = subjects[1];
        Subject subject3 = subjects[2];

        String gradesInSubject1 = subject1.name + " : " + Arrays.toString(subject1.scores);
        String gradesInSubject2 = subject2.name + " : " + Arrays.toString(subject2.scores);
        String gradesInSubject3 = subject3.name + " : " + Arrays.toString(subject3.scores);

        String allGrades = "\n"+name + " Grades : \n" +gradesInSubject1 + "\n" + gradesInSubject2  + "\n" + gradesInSubject3;

        return allGrades;
    }

    public void setGrade(int indexOfSubject, int testNumber,double gradeAchieved){
        subjects[indexOfSubject].setTestScore(testNumber,gradeAchieved);
    }



}
