package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String loop = "yes";
        while (loop.equals("yes")) {
            String sentence = promptAnswer();
            pigLatin(sentence);
            System.out.println("\nDo you want to continue? (yes/no)");
            loop = scnr.nextLine();
        }
    }

    private static String promptAnswer() {

        Scanner scnr = new Scanner(System.in);              //Input of a sentence from the user.
        System.out.println("Welcome to Pig latin Translator!");
        System.out.println("Enter a line to be Translated:");


        return scnr.nextLine().toLowerCase();
    }

    private static void pigLatin(String userInput) {
        String delims = " ";                                    //Braking the sentence into separate words.
        String[] tokens = userInput.split(delims);

        for (String token : tokens) {               //Looking for the word to start with a vowel.

            if (token.charAt(0) == 'a' ||
                    token.charAt(0) == 'e' ||
                    token.charAt(0) == 'i' ||
                    token.charAt(0) == 'o' ||
                    token.charAt(0) == 'u' ||
                    token.charAt(0) == 'A' ||
                    token.charAt(0) == 'E' ||
                    token.charAt(0) == 'I' ||
                    token.charAt(0) == 'O' ||
                    token.charAt(0) == 'U') {


                System.out.print(token + "way");                    //Prints word that starts with a vowel as "wordway"

                System.out.print(" ");

            } else if (token.charAt(0) != 'a' ||                    // blocking any words with vowels from entering
                    token.charAt(0) != 'e' ||
                    token.charAt(0) != 'i' ||
                    token.charAt(0) != 'o' ||
                    token.charAt(0) != 'u' ||
                    token.charAt(0) != 'A' ||
                    token.charAt(0) != 'E' ||
                    token.charAt(0) != 'I' ||
                    token.charAt(0) != 'O' ||
                    token.charAt(0) != 'U') {
                for (int j = 0; j < token.length(); j++) {

                    if (token.charAt(j) == 'a' ||
                            token.charAt(j) == 'e' ||
                            token.charAt(j) == 'i' ||
                            token.charAt(j) == 'o' ||                           //Finding the vowel in the word and breaking the word apart to rearrange
                            token.charAt(j) == 'u' ||
                            token.charAt(j) == 'A' ||
                            token.charAt(j) == 'E' ||
                            token.charAt(j) == 'I' ||
                            token.charAt(j) == 'O' ||
                            token.charAt(j) == 'U') {


                        System.out.print(token.substring(j) + token.substring(0, j) + "ay");     //Printing new word
                        System.out.print(" ");

                        break;     //exit loop
                    }

                }
            }

        }

    }

}


