import java.util.Scanner;

public class EmployeePerformance {

    static double averageScore(double communication, double problemSolving, double teamwork) {
        return (communication + problemSolving + teamwork) / 3;
    }

    static void printPerformanceLevel(double average) {
        if (average >= 80) System.out.println("Performance Level: Excellent");
        else if (average >= 70) System.out.println("Performance Level: Good");
        else if (average >= 60) System.out.println("Performance Level: Satisfactory");
        else if (average >= 50) System.out.println("Performance Level: Needs Improvement");
        else System.out.println("Performance Level: Unsatisfactory");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many employees? ");
        int employees = scanner.nextInt();

        for (int i = 1; i <= employees; i++) {
            System.out.println("\nEmployee " + i);

            System.out.print("Communication: ");
            double communication = scanner.nextDouble();

            System.out.print("Problem Solving: ");
            double problemSolving = scanner.nextDouble();

            System.out.print("Teamwork: ");
            double teamwork = scanner.nextDouble();

            double avg = averageScore(communication, problemSolving, teamwork);
            System.out.printf("Average Score: %.2f\n", avg);
            printPerformanceLevel(avg);
        }

        scanner.close();
    }
}
