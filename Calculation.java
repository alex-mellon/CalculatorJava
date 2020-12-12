package com.company;

public class Calculation {
    public static int Calculation(int number1,int  number2,char operation) {
        int res;
        switch (operation) {
            case '+':
                res = number1 + number2;
                break;
            case '-':
                res = number1 - number2;
                break;
            case '*':
                res = number1*number2;
                break;
            case '/':
                res = number1/number2;
                break;
            default:
                throw new Error("Вы ввели неправильные значения!");
        }
        return res;
    }
}
