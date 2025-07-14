import java.util.Random;

public class OrderIDGenerator {

    public static void main(String[] args) {
        Random random = new Random();
        //Creating instance of Random class
        String[] orderIDs = new String[5];
        //Declare an array to hold 5 orderIDs.

        for (int i = 0; i < orderIDs.length; i++) {
            //Generate a random uppercase letter between A(65) AND E(69)
            char prefix=(char)(random.nextInt(5)+ 'A');

            //random.nextInt - generates numbers between 0-4 then add A which is 65

          //Generate a random number from 1 to 999 and formart it with leading zeros
            int number= random.nextInt(999)+1;

            //random.nextInt -generates numbers between 0-998

            String suffix = String.format("%03d",number);

            orderIDs[i]=prefix+suffix;

        }
        //Print all generated order IDs
        for(String orderID: orderIDs){
            System.out.println(orderID);
        }



    }
}