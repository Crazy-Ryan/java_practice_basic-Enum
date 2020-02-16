import java.lang.reflect.Array;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        ArrayList<Student> studentArr = new ArrayList<>();
        studentArr.add(new Student("Linda", Gender.FEMALE));
        studentArr.add(new Student("Bob", Gender.MALE));
        studentArr.add(new Student("Solider", Gender.MALE));
        studentArr.add(new Student("Cindy", Gender.FEMALE));

        for (Student student : studentArr) {
            if (Gender.FEMALE == student.getGender()) {
                System.out.println("======================");
                System.out.println("Name: " + student.getName());
                System.out.println("Name: " + student.getGender());
            }
        }

    }

}
