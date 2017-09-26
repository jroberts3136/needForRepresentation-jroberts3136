package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        System.out.println("Enter you string.");
        String userString = keyInput.nextLine();
        int stringLength = userString.length();

        char[] lowerAlpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();    //+97 to ascii code
        char[] upperAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();    //+65 to ascii code
        char[] nonAlpha1 = " !\"#$%&'()*+,-./0123456789:;<=>?@".toCharArray();    //+33 to ascii code
        char[] nonAlpha2 = "[\\]^_`".toCharArray();    //+91 to ascii code
        char[] nonAlpha3 = "{|}~".toCharArray();    //+123 to ascii code

        int startType = (int)(Math.random() * 5);
        /*
        0 - Binary          Integer.toBinaryString();
        1 - Octal           Integer.toOctalString();
        2 - Decimal         Base ascii code
        3 - Hexadecimal     Integer.toHexString();
        4 - ASCII           Character
        */
        int startPosition = (int)(((Math.random() * 100) / 100) * stringLength);

    }
}
