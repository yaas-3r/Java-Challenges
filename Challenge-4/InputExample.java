import java.util.Scanner;

public class InputExample {
    Scanner scanner = new Scanner(System.in);

    public void readCityAndFood() {
        String location;
        String food;

        System.out.print("Which Country do you come from? ");
        location = scanner.next();

        System.out.print("What is your Country's local dish? ");
        food = scanner.next();

        System.out.println("In " + location + ", the local dish is " + food + "!");
    }

    public static void main(String[] args) {
        new InputExample().readCityAndFood();
    }
}
