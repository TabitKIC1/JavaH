package  h2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] array = line.split(",");
                String firstName = array[0].split(":")[1].replaceAll("\"", "");
                String grade = array[1].split(":")[1].replaceAll("\"", "");
                String subject = array[2].split(":")[1].replaceAll("\"", "");
                StringBuilder result = new StringBuilder();
                result.append("Студент ").append(firstName);
                result.append(" получил ").append(grade);
                result.append(" по предмету ").append(subject);
                System.out.println(result);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}