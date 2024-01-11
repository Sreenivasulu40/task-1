
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store students' grades
        ArrayList<Double> grades = new ArrayList<>();

        // Get the number of students from the teacher
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Input grades for each student
        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter grade for student " + i + ": ");
            double grade = scanner.nextDouble();
            grades.add(grade);
        }

        // Compute average, highest, and lowest scores
        double average = calculateAverage(grades);
        double highest = findHighest(grades);
        double lowest = findLowest(grades);

        // Display results
        System.out.println("\nResults:");
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        scanner.close();
    }

    // Method to calculate the average of the grades
    private static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Method to find the highest score
    private static double findHighest(ArrayList<Double> grades) {
        return Collections.max(grades);
    }

    // Method to find the lowest score
    private static double findLowest(ArrayList<Double> grades) {
        return Collections.min(grades);
    }
}
