package studentproject;

import java.util.*;
import java.util.stream.Collectors;

public class StudentService {

    List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayAll() {
        students.forEach(Student::display);
    }

    public void marksAbove70() {
        students.stream()
                .filter(s -> s.marks > 70)
                .forEach(Student::display);
    }

    public void groupByCourse() {
        Map<String, List<Student>> grouped =
                students.stream().collect(Collectors.groupingBy(s -> s.course));

        grouped.forEach((course, list) -> {
            System.out.println("Course: " + course);
            list.forEach(Student::display);
        });
    }

    public void sortByMarks() {
        students.sort((a, b) -> a.marks - b.marks);
        students.forEach(Student::display);
    }
}