package com.acwd.m1.IU8;

public class Parameter {
    public static void main(String[] args){

        power(2,16); //what is inside the (base, exp) is parentheses
        power(2,6); // "caller" of method
        power2(2.5, 6); // Can do decimals using double function
        power2(2.5, 16);
    }

    public static void power(int base, int exp) {

        int result = 1; // need to create variable "int" results =1;
        for(int i = 1; i <=exp; i++){
            result *=base;
        }

        System.out.println(base + " to the " + exp + "=" + result);
    }
    public static void power2(double base, int exp) { // double to accept any decimal values

        double result = 1; // need to create variable "double" results =1 for decimal place.
        for(int i = 1; i <=exp; i++){
            result *=base;
        }

        System.out.println(base + " to the " + exp + "=" + result);
    }



}
