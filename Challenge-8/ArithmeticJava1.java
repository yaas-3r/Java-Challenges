package Challenge8;
//Demonstrating handling using try and catch blocks.

public class ArithmeticJava1 {
    public static void main(String[]args){
        int number1=300;
        int number2=0;

        try{
            //CODE THAT MAY THROW AN EXCEPTION
            int answer=number1/number2;
            System.out.println("Answer"+answer);
        }
        catch(ArithmeticException e){
            //Handling exception
            System.out.println("Error:Division by zero is not allowed");
        }
        finally {
            //code that will always execute
            System.out.println("Program continues after handling the exception.");
        }

    }
}
