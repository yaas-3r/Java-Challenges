package practice;

public class Main {

    public static void main(String[] args) {

    double firstD = 21.00;
    double secondD = 80.00;
    double result = (firstD + secondD) * 100.00;
        System.out.println("Result of expression = "+result);

    double remainder = result % 40.00;
        System.out.println("Remainder = "+remainder);

    boolean isZero = remainder == 0.00 ? true : false;

        if(isZero) {
            System.out.println("There is no Remainder :" + isZero +"✅");
        }

        if(!isZero){
            System.out.println("There is no Remainder :" + isZero +"❌");
            System.out.println("Got some remainder");
        }else{
            System.out.println("The calculation is perfect");
        }


    }

}