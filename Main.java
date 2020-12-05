
import java.io.IOException;
import java.util.Scanner;

public class Main { // class for main grade book


    public static void main(String[] args) throws IOException {
        // objects
        Scanner scan = new Scanner(System.in);
        Course course1 = new Course();
        Student studentA = new Student("");

        // greeting the student
        System.out.print("Welcome to the Grade book!  Please enter your name: ");
        studentA.studentName = scan.nextLine();
        System.out.println("Would you like to access your old grades or enter new ones?");
        System.out.println("Enter 1 to input new grades, enter 2 for previous grades: ");

        int option = scan.nextInt();
        scan.nextLine();

        if (option == 1){
            System.out.println("Enter how many quiz grades you will be inputting: ");
            course1.numOfQuizzes = scan.nextInt();
            scan.nextLine();

            System.out.println("Please enter quiz grades for " + course1.printCourse() + ": ");
            boolean quizGradeinput = true; // flag for loop
            while (quizGradeinput) {
                String exitChoice;
                //input grades from student
                course1.enterQuizGrades(course1.QuizGrades, course1.numOfQuizzes);

                System.out.println("Are you done entering quiz grades? (Y/N): ");
                exitChoice = scan.nextLine();
                if (exitChoice.toLowerCase().startsWith("y")) {
                    quizGradeinput = false; // ends the loop
                }
            }


            System.out.println("How many exams grades will you enter for"+ course1.printCourse() + ": ");
            course1.numOfExams = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter exam grades: ");
            boolean examGradeinput = true;
            while (examGradeinput) {
                String exitChoice;
                //input exam grades from student
                course1.enterExamGrades(course1.ExamGrades, course1.numOfExams);

                System.out.println("Are you done inputting exam grades? (Y/N): ");
                exitChoice = scan.nextLine();
                if (exitChoice.toLowerCase().startsWith("y")) {
                    examGradeinput = false; // ends the loop
                }
            }

            System.out.println("Enter how many homework grades you will be inputting for" + course1.printCourse() + ": ");
            course1.numOfHomework = scan.nextInt();
            scan.nextLine();
            System.out.println("Please enter homework grades: ");
            boolean hwGradeinput = true;
            while (hwGradeinput) {
                String exitChoice;
                //input hw grades from student
                course1.enterHomeworkGrades(course1.HomeworkGrades, course1.numOfHomework);

                System.out.println("Are you finished entering homework grades? (Y/N): ");
                exitChoice = scan.nextLine();
                if (exitChoice.toLowerCase().startsWith("y")) {
                    hwGradeinput = false; // ends the loop
                }
            }

            System.out.println("How many projects grades will you input for"+ course1.printCourse() + ": ");
            course1.numOfProjects = scan.nextInt();
            scan.nextLine();
            System.out.println("Please enter project grades: ");
            boolean projectGradeinput = true;


            while (projectGradeinput) {
                String exitChoice;
                //input project grades from student
                course1.enterProjectGrades(course1.ProjectGrades, course1.numOfProjects);

                System.out.println("Are you finished entering project grades? (Y/N): ");
                exitChoice = scan.nextLine();
                if (exitChoice.toLowerCase().startsWith("y")) {
                    projectGradeinput = false; // ends loop
                }
            }
            course1.addWeightedGradestoMap(course1.averageGrades);
            System.out.println(course1.averageGrades);
            System.out.println("Your final grade is:" + course1.getWeightedGrade(course1.averageGrades));
            course1.weight=course1.getWeightedGrade(course1.averageGrades);
            System.out.println(course1.getLetterGrade(course1.weight));


            studentA.writeFile(course1.weight, course1.averageGrades);

        }
        else if (option == 2){
            studentA.previousGrades();
            studentA.printPreviousGrades();

        }
        else {
            System.out.println("Enter 1 or 2");
        }





    }

}