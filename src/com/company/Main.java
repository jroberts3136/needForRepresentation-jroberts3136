package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        System.out.println("Enter you string.");
        String userString = keyInput.nextLine();
        int stringLength = userString.length();

        int typeControl = (int)(Math.random() * 5);
        /*
        0 - Binary          Integer.toBinaryString(int);
        1 - Octal           Integer.toOctalString(int);
        2 - Decimal         Base ascii code
        3 - Hexadecimal     Integer.toHexString(int);
        4 - ASCII           Character
        */
        int startPosition = (int)(Math.random() * stringLength);

        StringBuilder firstRep = new StringBuilder();
        StringBuilder secondRep = new StringBuilder();

        char stringPiece;
        int charAscii;

        for(int i = startPosition; i < stringLength; i++){
            stringPiece = userString.charAt(i);
            charAscii = stringPiece;

            switch (typeControl){
                case 0:
                    firstRep.append(Integer.toBinaryString(charAscii));
                    break;
                case 1:
                    firstRep.append(Integer.toOctalString(charAscii));
                    break;
                case 2:
                    firstRep.append(charAscii);
                    break;
                case 3:
                    firstRep.append(Integer.toHexString(charAscii));
                    break;
                case 4:
                    firstRep.append(stringPiece);
                    break;
            }

            typeControl = (typeControl + 1) % 5;
        }

        for (int i = 0; i < startPosition; i++){
            stringPiece = userString.charAt(i);
            charAscii = stringPiece;

            switch (typeControl){
                case 0:
                    secondRep.append(Integer.toBinaryString(charAscii));
                    break;
                case 1:
                    secondRep.append(Integer.toOctalString(charAscii));
                    break;
                case 2:
                    secondRep.append(charAscii);
                    break;
                case 3:
                    secondRep.append(Integer.toHexString(charAscii));
                    break;
                case 4:
                    secondRep.append(stringPiece);
                    break;
            }

            typeControl = (typeControl +1) % 5;
        }

        System.out.print(secondRep);
        System.out.print(firstRep);
    }
}
