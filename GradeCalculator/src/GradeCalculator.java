import java.util.Scanner;
public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter marks obtained in each subject (out of 100).");

        int totalMarks = 0;
        int numberOfSub;
        double avgPercentage;

        System.out.print("Enter the number of subjects: ");
        numberOfSub = sc.nextInt();

        for (int i = 1; i <= numberOfSub; i++) {
            System.out.print("Subject " + i + " marks: ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        avgPercentage = (double) totalMarks / (numberOfSub * 100) * 100;

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgPercentage);

        String grade;

        if (avgPercentage >= 90) {
            grade = "A1 ";
        } else if (avgPercentage >= 80) {
            grade = "A2 ";
        } else if (avgPercentage >= 70) {
            grade = "B1 ";
        } else if (avgPercentage >= 60) {
            grade = "B2 ";
        } else if (avgPercentage >= 50) {
            grade = "C1 ";
        } else if (avgPercentage >= 40) {
            grade = "C2 ";
        } else {
            grade = "D ";
        }

        System.out.println("Grade: " + grade);
    }
}