import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        double percentage;
        char grade;

        System.out.println("===== STUDENT GRADE CALCULATOR =====");

        // Input Marks for 6 Subjects
        for (int i = 1; i <= 6; i++) {

            int marks;

            while (true) {

                System.out.print("Enter marks of Subject " + i + " (0-100): ");
                marks = sc.nextInt();

                if (marks >= 0 && marks <= 100) {
                    break; // Valid marks
                } else {
                    System.out.println("Invalid! Marks must be between 0 and 100.");
                }
            }

            total += marks;
        }

        // Calculate Percentage
        percentage = total / 6.0;

        // Assign Grade
        if (percentage >= 90) {
            grade = 'A';
        }
        else if (percentage >= 80) {
            grade = 'B';
        }
        else if (percentage >= 70) {
            grade = 'C';
        }
        else if (percentage >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }

        // Display Result
        System.out.println("\n========== RESULT ==========");
        System.out.println("Total Marks      : " + total + " / 600");
        System.out.println("Percentage       : " + percentage + "%");
        System.out.println("Grade            : " + grade);

        sc.close();
    }
}