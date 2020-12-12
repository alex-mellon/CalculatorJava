package com.company;

public class Main {


    public static void main(String[] args) throws Error {
        System.out.print("Enter numbers(between 1 and 10 inclusive)  and operation: ");

        String number1 = Operations.getNumb();
        char operation = Operations.getOperation();
        String number2 = Operations.getNumb();
        System.out.println( JustToIntAndBack.JustToIntAndBack(number1, number2, operation) );

    }

}
