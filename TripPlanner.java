package com.acwd.m1.IU6;

import java.util.* ;

//Class Header for this exercise is "public class TripPlanner"

public class TripPlanner {


    public static void main(String[] args) {

        Greeting();
        Traveltimeandbudget();
        Timedifference();
        CountryArea();
        //Hacker Problem();

    }

    public static void Greeting() {

        Scanner input1 = new Scanner(System.in); //Creates a scan object
        System.out.println("Hello & Welcome!");
        System.out.print("How should we address you?");
        String name = input1.nextLine(); // it will pause and wait for user to type in something and hit "enter" and save input into "name"
        System.out.println("Hello there, " + name); // this is to result in A (space) B \t=(tab)

        //System.out.println("Hello" + "\n" + name); this is to result in the return carriage reponse A/B \n= (new-line)
        //System.out.println("Hello" + "\"" + name); this is to result in A "B" \" = to create a " within a " x "
        //System.out.println("Hello" + "\t " + name); this is to result in A (space) B \t=(tab)


        Scanner input2 = new Scanner(System.in); // think this is redundant = will revisit this after doing the rest ********
        System.out.println("Where would you like to go?");
        String Location = input2.nextLine(); // Faris - use .nextLine to show the full sentence !!!!****
        System.out.println(Location + " sounds great a trip idea!"); //managed to show full description because of the command .nextLine
        //system.out.println("Your destination selected sounds like a good trip"); -- Remove the // if we decided are using this instead.
    }
    // End of Part 1 IU6 - Greeting

    //Start of Part 2A IU6 -Travel Time and Budget
    public static void Traveltimeandbudget() {

        Scanner input3 = new Scanner(System.in); //Creates a scan -Days.
        Scanner input4 = new Scanner(System.in); //Creates a scan -Budget
        Scanner input5 = new Scanner(System.in); //Creates a scan -Days.
        Scanner input6 = new Scanner(System.in);// creates a scan -Xchange Rate


        System.out.println("How many days will this trip be?");
        int days = input3.nextInt(); // it will pause and wait for user to type in something and hit "enter" and save input into "name"
        System.out.println("What will your budget(USD) be for this trip?");
        double budget = input4.nextDouble(); // it will pause and wait for user to type in something and hit "enter" and save input into "budget"
        double USD = 1.00; // Use Double because its has a decimal point e.g 1.0
        System.out.println("What is the three letter symbol for your destination?"); // Previously forgot to ask a question thats why stuck at a blank loop
        String Dc = input5.next(); //-Dc is Destination currency

        System.out.println("What is the Destination Currency Exchange Rate?");
        double Ce = input6.nextDouble();
        Double CurrencyConversionRate = Ce; // Cannot use String because previous line mention its decimal
        Double CurrencyConversion = budget * Ce;// <<-- how to string a Ce output?
        System.out.println("Alright so you will be staying for: \n" + days + " days" + "\n" + "USD $" + budget + "\n" + "Approximate Currency Conversion: " + CurrencyConversion + Dc);
        // this part is long because i am trying to do currency exchange with days,budget & CurrecnyXchange in 1 line.

        //Part 2b IU6 -Travel Time and Budget
        int day = 1; //days in a day
        int hour = 24; //hours in a day
        int minute = 60;//mins in an hour
        int secs = 60; // secs in a min
        int timespentD1 = days * day; // day counter
        int timespentD2 = days * day * hour; // day x hour
        int timespentD3 = days * day * hour * minute; // day x hour x min
        int timespentD4 = days * day * hour * minute * secs; // day x hour x sec

        System.out.println("Timespent in Total Trip: \n Days: " + timespentD1 + "\n Hours: " + timespentD2 + "\n Minutes: " + timespentD3 + "\n Seconds: " + timespentD4);
        Double Bpd = budget / days; // Budget per day (usd)
        double Bpd2 = (int)(budget / days * 100); // Budget per day (usd)
        double Bpd3 =(double)(Bpd2/100);
        System.out.println("Your tentaive Budget(USD) per day is: $" + Bpd3);

        Double EBpd = budget * Ce / days ; // need to user budget*Ce /days
        double EBpd2 = (int)(budget *Ce / days * 100);
        double EBpd3 = (double)(EBpd2/100) ;
        System.out.println("Your tentaive Budget " + (Dc) + " per day is: $" + EBpd3);

    }

    //End of part 2A & B

    //Start of part 3 - Time Difference
    public static void Timedifference() {

        System.out.println("What is the time difference of your destination? Please include the +/-");
        Scanner input8 = new Scanner(System.in);// Creates a scan for user's current time setting
        int Dt = input8.nextInt(); // scan for +/- 0hr for Destination time Dt

        String Zeros = "00";
        int Midnight = 24;
        int Noon = 12;
        String hr = "HR";


        if (Dt > 0)// compare if positive/ negative
        {
            System.out.println("This means that when its midnight at your home it will be GMT: " + ((Midnight + Dt) % Midnight) + ":" + Zeros + hr + "\n" + "GMT: " + (Noon + Dt) + ":" + Zeros + hr);

        } else {
            System.out.println("When it is noon at home it will be GMT: " + ((Midnight + Dt) % Midnight) + ":" + Zeros + hr + "\n" + "GMT: " + (Noon + Dt) + ":" + Zeros + hr);
        }
    }
    // end of part 3

    //start of part 4
    public static void CountryArea() {

        double miles = 1.60934;
        double miles2 = miles * miles;

        System.out.println("What is the area you will traveling?(km)");
        Scanner input9 = new Scanner(System.in); //Scan for distance in km
        double d1 = input9.nextDouble();
        double d2 = (int)(d1 / miles2 * 100);
        double d3 = (double) (d2/100);

        System.out.println(("The approximate country area is ") + (d3) + " in Miles");
    }
    //end of part 4

    //start of part 5 - Round?
    public static void Round() {

        System.out.println("Type any number");
        Scanner inputx = new Scanner(System.in);
        int answerFromOne = inputx.nextInt(); // multiply number i want to reformat by 100.
        double answerFromtwo = Math.round((answerFromOne * 100) / 100.0);
        System.out.println(answerFromtwo);// cant get round figure - need help. - need use casting


    }// end of part 5

    //start of part6
}