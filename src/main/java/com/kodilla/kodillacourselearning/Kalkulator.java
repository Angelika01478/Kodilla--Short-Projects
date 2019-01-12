package com.kodilla.kodillacourselearning;

public class Kalkulator {

    double add (double a, double b){
        return a+b;
    }


    double subtract (double a, double b){
        return a-b;
    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        double firstValue = kalkulator.add(15.4,8);
        double secondValue= kalkulator.subtract(25.785, 18.11);

        System.out.println("the result is equal: " +firstValue);
        System.out.println("the result is equal: " +secondValue);
    }
}
