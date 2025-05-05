package practice;

public class CheckAge {
    public static void main(String[] args) {
       int age = 20;

        CheckIsOfAge(age);


    }

    public static void CheckIsOfAge(int age){

        if (age <18 ){
            System.out.println("Under age!❌");
            printAge(false , age);
        }else{
            System.out.println("Above age✅");
            printAge(true , age);
        }


    }

    public static void printAge(boolean isOfAge , int age) {
        if(isOfAge){
            System.out.println("Age is " +age );
        }else{
            System.out.println("age is " +age);
        }
    }


}
