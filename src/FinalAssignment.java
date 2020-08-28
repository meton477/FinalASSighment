//You are to a write a program which asks a user to enter 10 words.  Save these words in an array.  Using the bubble sort algorithm (see below), sort the words in an ascending order. For the output, print out the words in the original order, in the ascending order, and in the descending order. Finally, print an array where all letters have been changed to uppercase. Don't forget to write a pseudocode or flowchart BEFORE writing your code.
//Enter 10 words: kiwi pineapple apple banana orange grapes watermelon cherry strawberry melon

        //Original Order:
       // kiwi pineapple apple banana orange grapes watermelon cherry strawberry melon

       // Alphabetical Order:
       // apple banana cherry grapes kiwi melon orange pineapple strawberry watermelon

       // Reversed Alphabetical Order:
        //watermelon strawberry pineapple orange melon kiwi grapes cherry banana apple

        //Upper case array:
       // APPLE BANANA CHERRY GRAPES KIWI MELON ORANGE PINEAPPLE STRAWBERRY WATERMELON

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//*Your output should look something like this:
public class FinalAssignment {
    public static void main(String[] args) {


        String dictionary[] = new String[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < dictionary.length; i++) {

            System.out.println("Please enter the word# " + (i + 1));
            Scanner scannerForWord = new Scanner(System.in);
            dictionary[i] = scannerForWord.nextLine();
        }

        System.out.println(Arrays.toString(dictionary));

        int i, j;
        String t;
        int l = dictionary.length;
        for (i = 0; i < (l - 1); i++) {
            for (j = 0; j < (l - 1) - i; j++) {
                if (dictionary[j].compareTo(dictionary[j + 1]) > 0) {
                    t = dictionary[j];
                    dictionary[j] = dictionary[j + 1];
                    dictionary[j + 1] = t;
                }
            }
        }

        System.out.println(Arrays.toString(dictionary));


        int y, u;
        String o;
        for (y = 0; y < (l - 1); y++) {
            for (u = 0; u < (l - 1) - y; u++) {
                if (dictionary[u].compareTo(dictionary[u + 1]) < 0) {
                    o = dictionary[u];
                    dictionary[u] = dictionary[u + 1];
                    dictionary[u + 1] = o;
                }
            }
        }

        System.out.println(Arrays.toString(dictionary));

        System.out.println(Arrays.toString(dictionary).toUpperCase());

    }

}