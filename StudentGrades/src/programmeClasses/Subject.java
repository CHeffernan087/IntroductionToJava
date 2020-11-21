package programmeClasses;

public class Subject {

    String name;
    double[] scores;

    public Subject(String subjectName){
        name = subjectName;
        scores = new double[10];
    }
    /*
    * pseudo code
    * double[] myScores = {10.5,20.9, 80.2, 60.5};
    * getTestScore(2) -> should return the score at index 2 e.g 80.2
    *
    * */
    public double getTestScore(int indexOfTestToReturn){
        double testScore = scores[indexOfTestToReturn];
        return testScore;
    }

    /*
    pseudo code
    double[] myScores = {10.5,20.9, 80.2, 0};
    setTestScore(3, 77.2) -> should set the 4th element of the array to  77.2 -> {10.5,20.9, 80.2, 77.2}
     */
    public  void setTestScore(int indexToUpdate, double testScore){
        scores[indexToUpdate] = testScore;
    }
}
