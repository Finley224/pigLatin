/*
 * Written by Xavier for AP CSA
 * Made for Java 1.8
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println("Enter a sentence to convert to Pig Latin: ");
        Scanner getSentence = new Scanner(System.in);
        String englishSentence = getSentence.nextLine();
        getSentence.close();

        String[] pigLatinConstructor = englishSentence.split("\\s+");
        ArrayList<String> pigLatinResult = new ArrayList<String>();

        for (String word : pigLatinConstructor) {
            String newWord = word.substring(1, word.length()) + word.substring(0, 1) + "a";
            String firstChar = newWord.substring(0,1);
            firstChar.toUpperCase();
            newWord = firstChar + newWord.substring(1, newWord.length());
            pigLatinResult.add(newWord);
        }

        String newSentence = "";
        
        for (String string : pigLatinResult) {
            newSentence = newSentence + string + " ";
        }

        System.out.println("You entered the following sentence: " + englishSentence);
        System.out.println("The Pig Latin version of your sentence is: " + newSentence);
    }
}
