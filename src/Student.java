public class Student {
    private String studentId;
    private String name;
    private String alias;
    public Student(String studentId, String name, String alias) {
        this.studentId = studentId;
        this.name = name;
        this.name = alias;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name;
    }
}