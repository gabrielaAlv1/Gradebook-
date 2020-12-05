import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;

public class Student {
        public int classSelection;
        //Object of Course class
        Course courseA = new Course();
        //Default Constructor1.

        String studentName;

        public Student(String s) {
        }

        //hashmap argument
        public void writeFile(double weight, HashMap<String, Double> averages)  throws IOException  {

                courseA.weight = weight;
                File studentFile = new File("src/studentFile.txt");

                if (!studentFile.exists()) {
                        studentFile.createNewFile();
                }
                try {

                        BufferedWriter writer = new BufferedWriter(new FileWriter(studentFile, true));
                        writer.write("The final Grade for ");
                        writer.write(studentName + " is "  +  weight + "\n");

                        //hashmap values to print
                        writer.write("Quiz average:"     + averages.get("AverageKeys.QUIZ_GRADE") + "\n" );
                        writer.write("Exam average:"     + averages.get("AverageKeys.EXAM_GRADE") + "\n" );
                        writer.write("Homework average:" + averages.get("AverageKeys.WORK_GRADE") + "\n");
                        writer.write("Project average:"  + averages.get("AverageKeys.PROJ_GRADE") + "\n" );
                        writer.close();

                } catch (IOException writerEx) {
                        System.out.println("Cannot write to file:permission issue:" + Arrays.toString(writerEx.getStackTrace()));
                }

        }
        List<String> priorGrades = new ArrayList<>();

        protected void previousGrades() {
                try{
                        FileReader reader = new FileReader("src/studentFile.txt");
                        BufferedReader bReader = new BufferedReader(reader);
                        String line = "";
                        while ((line = bReader.readLine()) != null) {
                                priorGrades.add(line);
                        }
                } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        protected void printPreviousGrades() {
                if (priorGrades.size() < 1) {
                        System.out.println("No old grades");
                } else {
                        System.out.println("Previous Grades: ");
                        for (String i : priorGrades) {
                                System.out.println(i);
                        }
                }
        }

}
