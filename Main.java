import java.io.IOException;
import java.util.Scanner;

    public class Main{
        public static void main(String[]args) throws IOException, IOException {

        System.out.println("Welcome to the Grade book! What is your name?");
        Scanner scan = new Scanner(System.in);

        Student studentA=new Student();
        studentA.studentName = scan.nextLine();
        System.out.println (studentA. studentName);
        System.out.println("Hello,"+ studentA. studentName);

//Print out course.
        Course course1 = new Course();
        System.out.println("Please enter grade for:"+course1.printCourse()+
        "Quiz, Exam, Homeworks, Project.");//needs system.out.print for method.

//Input grades from student.
        course1.enterGrades(course1.CourseOneGrade);
        System.out.println("Your grade is:"+course1.printCourse() + "is:");
        System.out.println(course1.gradeWeight(course1.CourseOneGrade));

        course1.weight=course1.gradeWeight(course1.CourseOneGrade);
        System.out.println(course1.checkGrade(course1.weight));

        studentA .writeFile (course1.weight);

        }
    }

