package question02_student;

public class Student {
    public int id;
    public int grade;

    public Student(int id, int grade) {
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + " | Grade: " + grade;
    }
}