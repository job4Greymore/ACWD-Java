package com.acwd.m1.IU9;
import sun.font.FontRunIterator;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class BattleShips {
    static String[][] oceanMap = new String[10][10];
    static int playerShip = 5;
    static int computerShip = 5;

    public static void main(String[] args) {
        System.out.println("This is a Battle ship Game (10 x 10 map)");
        System.out.println("The Objective is to sink 5 of the opponent ships that has been deployed in the map displayed");
        System.out.println("Player turn to deploy ship : ");

        printOceanMap();
        deployShip(); // player deploy ship
        printOceanMap();
        textA();
        computerShip(); // Computer deploy ship
        printOceanMap();
        textB(); // battle begin
        do {
            playerBattlePhrase();
            printOceanMap();
            computerBattlePhrase();
            printOceanMap();

        }while(computerShip >0);
        gameOver();

    }

    public static void printOceanMap() {
        //System.out.println("  0123456789  ");
        System.out.print("  ");// the blank space before the zeros.
        for (int row = 0; row < oceanMap.length - 1; row++) {
            System.out.print(row);
        }
        System.out.println(oceanMap.length - 1);

        for (int row = 0; row < oceanMap.length; row++) {
            System.out.print(row + "|");
            for (int col = 0; col < oceanMap[row].length; col++) {
                if (oceanMap[row][col] == null) {
                    System.out.print(" ");
                } else
                    switch (oceanMap[row][col]) {
                        case "1": // Player ship
                            System.out.print("@");
                            break;
                        case "2": // Computer ship
                            System.out.print(" ");
                            break;
                        case "3": // Attack missed
                            System.out.print("-");
                            break;
                        case "4": // Attacked Hit
                            System.out.print("!");
                            break;
                        case "5": // x sunken
                            System.out.println("x");
                        default:
                            System.out.print(" ");
                    }

            }
            System.out.println("|" + row);
        }
        System.out.print("  ");// the blank space before the zeros.
        for (int row = 0; row < oceanMap.length - 1; row++) {
            System.out.print(row);
        }
        System.out.println(oceanMap.length - 1);
        //System.out.println("  0123456789 ");
    }

    public static void deployShip() {
        Scanner sc = new Scanner(System.in);
        int playerShip = 0;
        do {
            System.out.println("enter x coordinate");
            int x = sc.nextInt();

            System.out.println("enter y coordinate");
            int y = sc.nextInt();

            if ((x >= 0 && x < oceanMap.length - 1) && (y >= 0 && y < oceanMap[0].length) && oceanMap[x][y] == null) {
                oceanMap[x][y] = "1";
                playerShip++;


            }
        } while (playerShip < 5);
    }

    public static void computerShip() {
        Random rand = new Random();
        int computerShip = 0;
        do {

            int x = rand.nextInt(10);


            int y = rand.nextInt(10);

            if ((x >= 0 && x < oceanMap.length - 1) && (y >= 0 && y < oceanMap[0].length) && oceanMap[x][y] == null) {
                oceanMap[x][y] = "2";
                computerShip++;

            }
        } while (computerShip < 5);
    }

    public static void textA() {

        System.out.println("Player has completed setting their ships");
        System.out.println(" ");
        System.out.println("Computer's turn to place their ships");
        System.out.println(" ");
    }

    public static void textB() {

        System.out.println(" ");
        System.out.println("Computer is done setting their ships");
        System.out.println("Let the battle Begin, Player moves first!");

    }

    public static void playerBattlePhrase() {
        Scanner pt = new Scanner(System.in); //pt = player's turn
        System.out.println("player turn");
        System.out.println("enter x coordinate");
        int x = pt.nextInt();

        System.out.println("enter y coordinate");
        int y = pt.nextInt();


        if (computerShip > 0) {
            if ((x >= 0 && x < oceanMap.length - 1) && (y >= 0 && y < oceanMap[0].length) && oceanMap[x][y] == "1") {
                oceanMap[x][y] = "4";
                System.out.println("Player Hit ally Ship!");
                System.out.println(" ");
                playerShip--;
                System.out.println("Ships reminding P : " + playerShip + "| C : " + computerShip);

            } else if ((x >= 0 && x < oceanMap.length - 1) && (y >= 0 && y < oceanMap[0].length) && oceanMap[x][y] == "2") {
                oceanMap[x][y] = "4";
                System.out.println("Player Hit Computer's Ship!");
                System.out.println(" ");
                computerShip--;
                System.out.println("Ships reminding P : " + playerShip + "| C : " + computerShip);

            } else if ((x >= 0 && x < oceanMap.length - 1) && (y >= 0 && y < oceanMap[0].length) && oceanMap[x][y] == null) {
                oceanMap[x][y] = "3";
                System.out.println("Player Missed Target");
                System.out.println(" ");
                System.out.println("Ships reminding P : " + playerShip + "C : " + computerShip);
            }
        } else {
            System.out.println(" ");
            System.out.println("Victory! Player has won!");
            System.out.println(" ");
        }

    }

    public static void computerBattlePhrase() {
        System.out.println(" ");
        System.out.println("Computer's turn");
        Random ct = new Random();
        int x = ct.nextInt(10);
        int y = ct.nextInt(10);

        if (playerShip > 0) {
            if ((x >= 0 && x < oceanMap.length - 1) && (y >= 0 && y < oceanMap[0].length) && oceanMap[x][y] == "1") {
                oceanMap[x][y] = "4";
                System.out.println("Computer Hit ally Ship!");
                System.out.println(" ");
                playerShip--;
                System.out.println("Ships reminding P : " + playerShip + "| C : " + computerShip);

            } else if ((x >= 0 && x < oceanMap.length - 1) && (y >= 0 && y < oceanMap[0].length) && oceanMap[x][y] == "2") {
                oceanMap[x][y] = "4";
                System.out.println("Computer Hit Player's Ship!");
                System.out.println(" ");
                computerShip--;
                System.out.println("Ships reminding P : " + playerShip + "| C : " + computerShip);

            } else if ((x >= 0 && x < oceanMap.length - 1) && (y >= 0 && y < oceanMap[0].length) && oceanMap[x][y] == null) {
                oceanMap[x][y] = "3";
                System.out.println("Computer Missed Target");
                System.out.println(" ");
                System.out.println("Ships reminding P : " + playerShip + "C : " + computerShip);
            }
        } else {
            System.out.println(" ");
            System.out.println("Computer Victory!");
            System.out.println(" ");
        }
    }
    public static void gameOver(){

        if (playerShip  == 0) {
            System.out.println(" ");
            System.out.println("Game Over");
            System.out.println("Computer Victory!");
            System.out.println("Better Luck next time!");
        }else if (computerShip ==0 ){
            System.out.println(" ");
            System.out.println("Game Over");
            System.out.println("Player Victory!");
            System.out.println("You are awesome!");
        }

    }
}