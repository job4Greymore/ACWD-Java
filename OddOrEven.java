package com.acwd.m1.IU7;

import java.util.Random;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        GameStart();

    }

    // start of Part 1
    public static void GameStart() {

        System.out.println("Hello, let's play a game called \" Odds and Evens\"");
        System.out.println("Please type in your name");
        Scanner Input1 = new Scanner(System.in);
        String Name = Input1.nextLine();
        System.out.println("Pick a side " + Name + " team (O)dds or (E)vens");

        String O = "Odd";
        String E = "Evens";


        Scanner input2 = new Scanner (System.in);
        String Side = input2.next(); // Play choose a side

        if(Side.equals("E") || Side.equals("e")) {
            // to Do string ||(either or) need to be datatype.equals("variable1") || datatype.equals("variable2")

            System.out.println("You are Team Evens!");
            System.out.println("Computer(AI) is Team Odds!");
        }
        else{
            System.out.println("You are Team Odds!");
            System.out.println("Computer(AI) is Team Evens!");
        }
        System.out.println("------------------------------------------------------------");

        //start of part 2

        String Po = "player Odds";
        String Pe = "player Evens";
        String Co = "Computer(AI Odds";
        String Ce = "Computer(AI) Evens";

        System.out.println("How many fingers are you going to Play? (Max:5)");
        Scanner input3 = new Scanner(System.in);
        int PChoice = input3.nextInt(); // Pchoice = Player choice
        System.out.println("You played: "+ PChoice + " Fingers");

        Random rand = new Random();
        int Cc = rand.nextInt(6); // Cc = Computer choice
        System.out.println("Computer has played " + Cc +" Fingers");
        System.out.println("------------------------------------------------------------");
        // end of part 2
        // Start of part 3

        int Total = PChoice + Cc;

        System.out.println("The total fingers played is : " + Total);

        if (Total %2 ==0){

            if (Side.equals("E")){
                System.out.println(Total + ".... Even Wins");
                System.out.println("Player Wins this round!");
                System.out.println("----------------Game Over---------------------");

            }else {
                System.out.println(Total + ".... Even Wins");
                System.out.println("Computer(AI) Wins this round!");
                System.out.println("----------------Game Over---------------------");
            } // Did the longer method because wanted to understand the logic behind it


        }else if (Side.equals("O")) {
            System.out.println(Total + ".... Odd Wins");

            System.out.println("Player Wins this round!");
            System.out.println("----------------Game Over---------------------");

        }else {
            System.out.println("Computer(AI) Wins this round!");
            System.out.println("----------------Game Over---------------------");
        }


    }// part 3 done


}
