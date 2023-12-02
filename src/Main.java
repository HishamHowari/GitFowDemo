import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");

        // Create an exam
        Exam mathExam = new Exam("Mathematics Exam", 100);

        // Enroll students in the exam
        mathExam.enrollStudent(student1);
        mathExam.enrollStudent(student2);

        // Display information
        System.out.println("Exam Information:");
        System.out.println(mathExam);

        System.out.println("\nEnrolled Students:");
        for (Student student : mathExam.getEnrolledStudents()) {
            System.out.println(student);
        }

        // Simulate grading (assuming a simple scenario)
        Scanner scanner = new Scanner(System.in);
        for (Student student : mathExam.getEnrolledStudents()) {
            System.out.print("Enter score for " + student.getName() + ": ");
            int score = scanner.nextInt();

            // Perform validation on the entered score
            if (score < 0 || score > mathExam.getMaxScore()) {
                System.out.println("Invalid score. Please enter a valid score.");
                return;
            }

            System.out.println("Score for " + student.getName() + ": " + score);
        }

        // Close the scanner
        scanner.close();
    }
}
