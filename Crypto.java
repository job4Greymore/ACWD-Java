package com.acwd.m1.IU8;

import java.util.Scanner;

public class Crypto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a universal Scanners for all "constructor" to use as all of ti
        System.out.println("Please enter text to be Normalize : "); // ask for input.
        String text = input.nextLine(); // /Reminder to Self to use Input(x) for any scan value.

        // copy text for input1: ("this is some "really" great.(text)!?") <<--- in this exercise the "\really\" is written in syntex form.

        // With the universal scanner above in place, now create all print out required.

        //Part 1 - Normalizetext
        String normalized = normalizeText(text);
        System.out.println(normalized);
        /*
        System.out.println(normalizeText(text));
        System.out.println(text);
        System.out.println("-------------------------- "+ "\n");
        */

        //part 2 - Ceasarifytext

        System.out.println("Please enter shift Value : "); // asking for shift value from user.
        int shiftValue = input.nextInt(); // record the shift value with Int because it will be an number that +x/-x.

        String caesarifiedText = caesarify(normalized, shiftValue);
        System.out.println(caesarifiedText);
        System.out.println("-------------------------- " + "\n");

        //part 3 - Groupify
        System.out.println("How many words form a group?");
        int groupsize = input.nextInt();
        // record the the number of characters that form a group

        String groupifiedText = groupify(caesarifiedText  , groupsize );
        //Taking String value from casesirfied Text and spilting into groupsize value
        System.out.println(groupifiedText);
        System.out.println(" -------------------------- ");

        //part 4 - Encryption
        System.out.println("Encryption completed, this is your resutl : ");
        System.out.println("---------------------------------------------");
        System.out.println(encryptString(normalized, shiftValue,groupsize)+ "x");

        //part 5 - Decryption
        //- do when you free.

    }
    public static String normalizeText(String t) { // Inferred from the Scanner above

        String text = t.replaceAll("[\\s.,:;'!?()\"]","");
        // trying to take away Foreign characters. .,:;'!?"()
        // (\\s is for any spacing)
        text = text.toUpperCase(); // return text1(new t filtered) in uppercase

        return text; // text1 = noramlizedText;

    } // end of part 1 - Normalize Text

    public static String caesarify(String t , int shiftValue) {


        String result ="";

        for (int i  = 0 ; i < t.length(); i++){
            int c = t.charAt(i);
            c +=   shiftValue;

            if (c > 90) {
                c -=26;
            } else if (c < 65){
                c+=26;
            }
            char curChar = (char) c;
            result += curChar;
        }

        return result;

    }

    public static String groupify (String previousText, int groupsize) {
        //break String T , into int groupsize value

        // this is the group the words, ilikeapple if groupify(2) = il ik ea pp le
        String newText =""; // Create negative spacing aka no spacing.

        int counter = 1;// create a counter.
        for (int i = 0; i < previousText.length(); i++) {
            // i = index starting from 0, i <
            // t.lenght(); i++ = means if the Index is lesser the the String T length, Index + 1 value
            // refer to this youtube video to understand Loops : https://www.youtube.com/watch?v=6djggrlkHY8
            newText +=previousText.charAt(i);

            if (counter == groupsize) {
                // counter has(%) any reminder and is not(!) equals to 0, do the following action
                counter = 1;
                newText += " ";
                // Initial String Text at line 85, giving a new value to the string text if condition is met.
            }else {
                counter++;
            }

        }

        for (int i = groupsize - counter; i > 0; i--) {
            newText += "x";

            // my X is missing.
        }
        return newText;

    }
    public static String encryptString(String initalText, int svalue, int groupsize){

        String text = "";
        String text2 =  normalizeText(initalText);
        String text3 =caesarify (text2, svalue);
        text = groupify(text3,groupsize);

        return text;

    }

    public static String ungroupify(String t){
        String ungrouppedText = t.replaceAll("[\\sx]", "");
        return ungrouppedText;


    }
    public static String decryptString(String t,int sValue) {
        return ungroupify(t);

    }




}

