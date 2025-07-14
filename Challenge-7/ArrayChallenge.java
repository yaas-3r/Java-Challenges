public class ArrayChallenge {

    public static void main(String[] args) {
        String[] IDs = {"B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179", "B238", "A789", "C654"};

        for (int i = 0; i < IDs.length; i++) {
            if (IDs[i].charAt(0) == 'B') {
                System.out.println(IDs[i]);
            }
        }
    }
}
