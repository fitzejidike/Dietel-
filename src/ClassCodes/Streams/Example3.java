package ClassCodes.Streams;

import java.io.*;

public class Example3 {
        public static void main(String[] args) {

            String fileLocation = "C:\\Users\\fitz\\IdeaProjects\\Dietel pratice\\src\\ClassCodes\\streams\\Example3.txt";

            try(PrintStream printStream = new PrintStream(fileLocation)) {

                System.setOut(printStream);
                System.out.println("Trying to be done"); // it sout into the file created.
            }catch (IOException e) {

                System.err.println(e.getMessage());
            }
        }
    }

