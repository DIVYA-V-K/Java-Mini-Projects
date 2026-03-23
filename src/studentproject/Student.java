package studentproject;

public class Student {

    int studentId;
    String name;
    String course;
    int marks;

    public Student(int studentId, String name, String course, int marks) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    public void display() {
        System.out.println(studentId + " " + name + " " + course + " " + marks);
    }
}