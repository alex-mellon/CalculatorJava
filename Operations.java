package com.company;
import java.util.Scanner;

public class Operations {

    static Scanner scanner = new Scanner(System.in);


    public static String getNumb() {
        String num = new String();
        if (scanner.hasNextLine()) {
            num = scanner.next();
        } else {
            throw new Error("Вы ничего не ввели!");
        }
        return num;
    }

    public static char getOperation(){
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            throw new Error("Вы ничего не ввели!");
        }
        return operation;
    }
}
