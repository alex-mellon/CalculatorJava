package com.company;

public class RomanToArab {

   public static int ChangeRomToArab(String number) {
        switch (number) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                return -1;
        }
   }

   public static String BackToRoman(int number) {
        String ans = new String();
        if ((number - 100) >= 0) {
            ans += "C" + BackToRoman(number-100);
        } else if ((number - 90) >= 0) {
            ans += "XC" + BackToRoman(number-90);
        } else if ((number - 50) >= 0) {
            ans += "L" + BackToRoman(number-50);
        } else if ((number - 40) >= 0) {
            ans += "XL" + BackToRoman(number-40);
        } else if ((number - 10) >= 0) {
            ans += "X" + BackToRoman(number-10);
        } else if ((number - 9) >= 0) {
            ans += "IX" + BackToRoman(number-9);
        } else if ((number - 5) >= 0) {
            ans += "V" + BackToRoman(number-5);
        } else if ((number - 4) >= 0) {
            ans += "IV" + BackToRoman(number-4);
        } else if ((number - 1) >= 0) {
            ans += "I" + BackToRoman(number-1);
        }
        return ans;
   }

}
