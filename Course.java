
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Course { // class for courses and calculations associated with them

    // Class fields
    double quizWeight = 0.20;
    double examWeight = 0.30;
    double homeworkWeight = 0.25;
    double projectWeight = 0.25;
    double weight;
    int numOfQuizzes;
    int numOfExams;
    int numOfHomework;
    int numOfProjects;


    //public static String[] Courses = {Cop2006};

    Scanner scan = new Scanner(System.in);
    //course 1
    public String course = "Cop 2006";

    //Array list for storing quiz grades
    ArrayList<Double> QuizGrades = new ArrayList<>();

    //Array list for storing exam grades
    ArrayList<Double> ExamGrades = new ArrayList<>();

    //Array list for storing hw grades
    ArrayList<Double> HomeworkGrades = new ArrayList<>();

    //Array list for storing project grades
    ArrayList<Double> ProjectGrades = new ArrayList<>();


    //Method for storing grades entered by user
    protected void enterQuizGrades(ArrayList<Double> array, int numIterations) {
        // initialize variable to replace i < 4 so student can choose how many grades to enter
        for (int i = 0; i < numIterations; i++) {
            array.add(scan.nextDouble());
        }
        System.out.println("Your quiz grades are: ");
        System.out.println(array.toString());
    }

    protected void enterExamGrades(ArrayList<Double> array, int numIterations) {
        for (int i = 0; i < numIterations; i++) {
            array.add(scan.nextDouble());
        }
        System.out.println("Your exam grades are: ");
        System.out.println(array.toString());
    }

    protected void enterHomeworkGrades(ArrayList<Double> array, int numIterations) {
        for (int i = 0; i < numIterations; i++) {
            array.add(scan.nextDouble());
        }
        System.out.println("Your homework grades are: ");
        System.out.println(array.toString());
    }

    protected void enterProjectGrades(ArrayList<Double> array, int numIterations) {
        for (int i = 0; i < numIterations; i++) {
            array.add(scan.nextDouble());
        }
        System.out.println("Your project grades are: ");
        System.out.println(array.toString());
    }



    //Method for printing course(s)
    public String printCourse() {
        return course;
    }



    protected double getGradeAverage(ArrayList<Double> array) {
        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        return sum/array.size();
    }



    // method for assigning letter grade to weighted grade
    protected String getLetterGrade(double weight) {
        if (weight > 89) {
            return "  You got an A!";
        } else if (weight > 79 && weight < 89) {
            return "  You got a B!";
        } else if (weight > 69 && weight < 79) {
            return " You got a C :/";
        } else if (weight > 59 && weight < 69) {
            return "You got a D :(";
        } else {
            return "You failed";
        }

    }
    // empty hashmap
    HashMap<String, Double> averageGrades = new HashMap<>();

    protected void addWeightedGradestoMap(HashMap<String, Double> map) {
        map.put("AverageKeys.QUIZ_GRADE", getGradeAverage(QuizGrades));
        map.put("AverageKeys.EXAM_GRADE", getGradeAverage(ExamGrades));
        map.put("AverageKeys.WORK_GRADE", getGradeAverage(HomeworkGrades));
        map.put("AverageKeys.PROJ_GRADE", getGradeAverage(ProjectGrades));
    }

    // method for weighted grade calculation
    protected double getWeightedGrade(HashMap<String, Double> map) {
        HashMap<String,Double> gradeWeight2;
        gradeWeight2 = map;

        double weight = (quizWeight     * gradeWeight2.get("AverageKeys.QUIZ_GRADE"))  +
                (examWeight     * gradeWeight2.get("AverageKeys.EXAM_GRADE")) +
                (homeworkWeight * gradeWeight2.get("AverageKeys.WORK_GRADE"))   +
                (projectWeight  * gradeWeight2.get("AverageKeys.PROJ_GRADE"));
        return weight;
    }


}