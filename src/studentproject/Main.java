package studentproject;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n1 Add Student");
            System.out.println("2 View All Students");
            System.out.println("3 Students with Marks > 70");
            System.out.println("4 Group Students by Course");
            System.out.println("5 Sort Students by Marks");
            System.out.println("6 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    try {
                        System.out.println("Enter ID:");
                        int id = sc.nextInt();

                        System.out.println("Enter Name:");
                        String name = sc.next();

                        System.out.println("Enter Course:");
                        String course = sc.next();

                        System.out.println("Enter Marks:");
                        int marks = sc.nextInt();

                        if (marks < 0 || marks > 100)
                            throw new InvalidMarksException("Marks must be between 0 and 100");

                        service.addStudent(new Student(id, name, course, marks));

                    } catch (InvalidMarksException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    service.displayAll();
                    break;

                case 3:
                    service.marksAbove70();
                    break;

                case 4:
                    service.groupByCourse();
                    break;

                case 5:
                    service.sortByMarks();
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}
