package practice;

import java.util.Scanner;

public class BarkingDog {

    public static void main(String[] args) {
        boolean barking;
        int hourOfDay;


        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter true or false");
        barking = scanner.nextBoolean();
        System.out.println("Please enter hrs");
        hourOfDay = scanner.nextInt();

        while (hourOfDay < 0 || hourOfDay > 23) {
            System.out.println("invalid please try again!");
            System.out.println("Please enter hrs");
            hourOfDay =  scanner.nextInt();
        }
        boolean trueOrFalse = shouldWakeUp(barking , hourOfDay);
        System.out.println(trueOrFalse);

        shouldWakeUp(barking, hourOfDay);
        scanner.close();

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        // if the hourOfDay is less than 0 or greater than 23, it's not
        // valid, so return false


        if (hourOfDay < 0 || hourOfDay > 23) {
            System.out.println("invalid please try again!");
            return false;
        }
            // if the dog is barking, and it's before 8am or after 10pm,
            // then you should wake up.

            return  barking && (hourOfDay < 8 || hourOfDay > 22);
        }


    }

