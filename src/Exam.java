import java.util.ArrayList;
import java.util.List;

public class Exam {
    private String examName;
    private int maxScore;
    private List<Student> enrolledStudents;

    public Exam(String examName, int maxScore) {
        this.examName = examName;
        this.maxScore = maxScore;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getExamName() {
        return examName;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    @Override
    public String toString() {
        return "Exam: " + examName + ", Max Score: " + maxScore;
    }
}