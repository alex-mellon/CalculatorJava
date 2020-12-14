package com.company;

public class Main {


    public static void main(String[] args) throws MyError {
        System.out.print("Enter numbers(between 1 and 10 inclusive)  and operation: ");

        String number1 = Operations.getNumb();
        char operation = Operations.getOperation();
        String number2 = Operations.getNumb();
        String ans = JustToIntAndBack.JustToIntAndBack(number1, number2, operation);
        System.out.println(ans);

    }

}
