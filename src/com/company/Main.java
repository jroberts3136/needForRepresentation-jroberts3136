package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        System.out.println("Enter you string.");
        String userString = keyInput.nextLine();
        int stringLength = userString.length();

        int startType = (int)(Math.random() * 5);
        /*
        0 - Binary
        1 - Octal
        2 - Decimal
        3 - Hexadecimal
        4 - ASCII
        */
        int startPosition = (int)(((Math.random() * 100) / 100) * stringLength);

        //String[] binary = {}
    }
}
