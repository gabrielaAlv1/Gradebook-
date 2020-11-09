import java.util.ArrayList;
import java.util.Scanner;
public class Course {
    //Class Fields.
    double quiz = .20;
    double exam = .30;
    double homework = .25;
    double project = .25;
    double weight;


    Scanner scan = new Scanner(System.in);
    //public static String[] Courses={"Math", "English","Science"};
    public String Course = "Cop 2006:" ;

    // ArrayList for storing grades. (Quiz, Exam, Homework,Project)
    ArrayList<Double> CourseOneGrade = new ArrayList<>();
    private Object ArrayList;

    //Method for course(s)
    public String printCourse() {
        return Course;
    }

    //Method for storing grades.
    protected void enterGrades(ArrayList<Double> CourseOneGrades) {
        for (int i = 0; i < 4; i++) {
            CourseOneGrades.add(scan.nextDouble());
        }
        System.out.println("Your grades are:");
        System.out.println(CourseOneGrade.toString());
    }
    //Arraylist for weighting grades.
    protected double gradeWeight(ArrayList<Double> CourseOneGrades) {
        ArrayList<Double> gradeWeight2;
        gradeWeight2 = CourseOneGrades;

        double weight = (quiz * gradeWeight2.get(0)) + (exam * gradeWeight2.get(1)) + (homework * gradeWeight2.get(2)) +
                (project * gradeWeight2.get(3));
        return weight;
    }
//For loop the grades(Student will get its letter grade)
    protected char checkGrade(double weight) {
        if (weight >= 90) {
            return 'A';

        } else if (weight >= 80 && weight <= 89) {
            return 'B';
        } else if (weight >= 70 && weight <= 79) {
            return 'C';
        } else if (weight >= 60 && weight <= 69) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
