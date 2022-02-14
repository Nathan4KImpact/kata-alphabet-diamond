package com.mss.selftraining;

import java.util.Locale;

public class Diamond {

    char someChar = 'A';
    char[] alphabet = new char[26];


    public void printDiamond ( char L){
        StringBuilder logLine = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            alphabet[i] = someChar;
            someChar += 1;
        }
        int indexInput = String.valueOf(alphabet).indexOf(String.valueOf(L).toUpperCase());
        if (indexInput<0) logLine.append("Vous devez saisir une lettre de l alphabet");
        //else if (indexInput==0) logLine.append(String.valueOf(L).toUpperCase());
        else
        for (int i = 0; i < indexInput* 2 + 1; i++) {
            for (int j = 0; j < indexInput * 2 + 1; j++) {

                if ( Math.abs(i-j) == indexInput||   i+j == indexInput || i+j == 3*indexInput )
                    if (i <= indexInput)   logLine.append(alphabet[i]);
                        else  logLine.append(alphabet[2*indexInput-i]);
                else logLine.append(" ");
            }
            logLine.append("\n\r");
        }

        System.out.println(logLine);
    }
}


