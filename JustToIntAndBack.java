package com.company;

public class JustToIntAndBack {

    public static String JustToIntAndBack(String number1, String number2, char operation) throws MyError{
        int num1, num2;
        String ans = new String();
        if ((StrArabToInt(number1) != -1) && (StrArabToInt(number2) != -1)) {
            num1 = StrArabToInt(number1);
            num2 = StrArabToInt(number2);
            if ((num1 > 0 && num1 < 11) && (num2 > 0 && num2 < 11)) {
                int answer = Calculation.Calculation(num1, num2, operation);
                ans = Integer.toString(answer);
            }
        }
        if ((StrRomToInt(number1) != -1) && (StrRomToInt(number2) != -1)) {
            num1 = StrRomToInt(number1);
            num2 = StrRomToInt(number2);
            if ((num1 > 0 && num1 < 11) && (num2 > 0 && num2 < 11)) {
                int answer = Calculation.Calculation(num1, num2, operation);
                ans = RomanToArab.BackToRoman(answer);
            } else {
                throw new MyError("Вы ввели неправильные значения!", -1;
            }
        } 
        return ans;
    }

    public static int StrArabToInt(String number) {
        int numb;
        try {
            numb = Integer.parseInt(number);
            return numb;
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    public static int StrRomToInt(String number) {
        try {
            RomanNumbers.valueOf(number);
            return RomanToArab.ChangeRomToArab(number);
        } catch (IllegalArgumentException q) {
            return -1;
        }
    }

}
class MyError extends Exception{

    private int number;
    public int getNumber(){return number;}
    public MyError(String message,int num){

        super(message);
        number=num;
    }
}
