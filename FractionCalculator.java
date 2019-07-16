package com.acwd.m1.IU10;
import com.sun.org.apache.xpath.internal.functions.FuncSubstring;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.security.PrivateKey;
import java.util.*;

/**
 * Created by Benjamin
 */

public class FractionCalculator {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        openingText();
        operator();
    }


    private static void openingText(){
        System.out.println("This is a Fraction Calculator");
        System.out.println("It will Add(+), Subtract(-), Divide(/) & Multiply(*) fractions until you hit the Q to quit");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Any (-)Negative denominator will transfer the it's negativity to the Numerator");
    }



    private static void operator() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your operator type");
        String a = input.next();
        int resultNr;
        int resultDr;

        if (a.contains("+")) {
            System.out.println("this will be a Addition method");
            Fraction f1 = new Fraction(1,2);
            Fraction f2 = new Fraction(1,3);
            resultNr = (f1.getNumerator()* f2.getDenominator() + (f2.getNumerator() * f1.getDenominator()));
            resultDr = f1.getDenominator() * f2.getDenominator();

           Fraction result = new Fraction(resultNr, resultDr);
            System.out.println(result.toString());


        } else if (a.contains("-")) {
            System.out.println("this will be a Subtractive method");
            Fraction f1 = new Fraction(4);
            Fraction f2 = new Fraction(3,2);
            resultNr = (f1.getNumerator()* f2.getDenominator() - (f2.getNumerator() * f1.getDenominator()));
            resultDr = f1.getDenominator() * f2.getDenominator();

            Fraction result = new Fraction(resultNr, resultDr);
            System.out.println(result.toString());
        } else if (a.contains("*")) {
            System.out.println("this will be a Multiplication method");
            Fraction f1 = new Fraction(-2);
            Fraction f2 = new Fraction(5,2);
            resultNr = f1.getNumerator()* f2.getNumerator();
            resultDr = f1.getDenominator() * f2.getDenominator();
            Fraction result = new Fraction(resultNr, resultDr);
            System.out.println(result.toString());

        } else if (a.contains("/")) {
            System.out.println("this will be a Division method");
            Fraction f1 = new Fraction(3,12);
            Fraction f2 = new Fraction(1,4);
            resultNr = f1.getNumerator()* f2.getDenominator();
            resultDr = f1.getDenominator() * f2.getNumerator();
            Fraction result = new Fraction(resultNr, resultDr);
            System.out.println(result.toString());

        } else if (a.contains("=")) {
            System.out.println("this will be an Equals to method");
            Fraction f1 = new Fraction(50,100);
            Fraction f2 = new Fraction (1,2);
            resultNr = f1.getNumerator()* f2.getDenominator();
            resultDr = f1.getDenominator() * f2.getNumerator();
            Fraction result = new Fraction(resultNr, resultDr);
            System.out.println(result.toString());

        } else if (a.contains("q")) {
            System.out.println("Quitting Fractional Calculator");
        } else
            System.out.println("Your operator is invalid please try typing in the relevant inputs +,-,/,=,* or Q to quit");
    }


    public static boolean validFraction(String sample) {

        if (sample.contains("/")) {
            int i = sample.indexOf('/');
            String num = sample.substring(0, 1);
            String den = sample.substring(i + 1, sample.length());
            if (isNumber(num)) {
                if (isNumber(den)) {
                    if (Integer.parseInt(den) > 0) {
                        return true;
                    }
                }
            }
        } else if (isNumber(sample)) {
            if (Integer.parseInt(sample) != 0) {
                return true;
            }
        } return false;
    }
    private static boolean isNumber(String sample) {
            //check if string is empty
            if (sample == null || sample.equals("")){

                return false;
            }
            for (int i = 0; i <sample.length() ; i++) {
                char check = sample.charAt(i);
                if( i == 0 && check == '-'){
                    continue;
                }
                if(check < '0' || check > '9'){
                    return false;
                }

            }return true;

    }
}