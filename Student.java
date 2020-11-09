import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
        public class Student {
        //Object of Course class
        //Course course1 = new Courses();
        //Default Constructor1.
        // Student() {}
        String studentName;
                private Course course1;

                public void writeFile(double weight)  throws IOException  {
                File studentFile = new File("src/studentFile.text");
                if (!studentFile.exists()) {
                        studentFile.createNewFile();
                }
                try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter(studentFile, true));
                        writer.write("The student Grade");
                        writer.write(studentName + weight);
                        writer.close();

                } catch (IOException writerEx) {
                        System.out.println("Cannot write to file:permission issue:" + writerEx.getStackTrace());
                }
        }
}