import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {
    public static void main(String[] args) {
        String[] itemCodes = {"B14", "A11", "B12", "A13"};

        // Sort the array in ascending/alphabetical order
        System.out.println("Sorted ....");

        Arrays.sort(itemCodes); // Sort the array
        for (String code : itemCodes) {
            System.out.println("-- " + code);
        }

        // Reverse the sorted array
        System.out.println("\nReversed ....");

        List<String> codeList = Arrays.asList(itemCodes); // Convert to list
        Collections.reverse(codeList); // Reverse the list

        for (String code : codeList) {
            System.out.println("-- " + code);
        }
    }
}
