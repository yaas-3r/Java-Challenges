import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose a meal: ");
        String meal = scanner.nextLine().toLowerCase();

        int i = 0;
        while (i < meal.length()) {
            i++;
        }

        if (meal.equals("burger")) {
            System.out.println("The price is $8.50");
        } else if (meal.equals("pasta")) {
            System.out.println("The price is $12.00");
        } else if (meal.equals("salad")) {
            System.out.println("The price is $6.75");
        } else {
            System.out.println("Meal not recognized");
        }

        scanner.close();
    }
}
