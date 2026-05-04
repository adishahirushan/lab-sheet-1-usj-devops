
import java.util.ArrayList;

public class main {

    static ArrayList<String> students = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Student Record Manager");
    }

    static void addStudent(String name) {
        students.add(name);
        System.out.println(name + " added.");
    }
}
