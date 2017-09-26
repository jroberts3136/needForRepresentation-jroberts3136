package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        System.out.println("Enter you string.");
        String userString = keyInput.nextLine();
        int stringLength = userString.length();

        char[] ascii = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ !\"#$%&'()*+,-./0123456789:;<=>?@[\\]^_`{|}~".toCharArray(); //int asciiCode = char

        int startType = (int)(Math.random() * 5);
        /*
        0 - Binary          Integer.toBinaryString(int);
        1 - Octal           Integer.toOctalString(int);
        2 - Decimal         Base ascii code
        3 - Hexadecimal     Integer.toHexString(int);
        4 - ASCII           Character
        */
        int startPosition = (int)(((Math.random() * 100) / 100) * stringLength);

    }
}
