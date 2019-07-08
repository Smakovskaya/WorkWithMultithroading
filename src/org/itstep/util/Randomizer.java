package org.itstep.util;

import java.util.Random;

public class Randomizer {

    public static int getRandomNumber (int from, int to) {
        Integer number = from + ( new Random().nextInt(to - from) );
        return  number;
    }

    public  static String getRandomString (int length) {
        String text = "";

        String alphabet = "abcdefghijklmoprstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char[] symbols = alphabet.toCharArray();

        for (int i = 0; i < length; i++) {
            text += symbols[getRandomNumber(0, symbols.length-1)];
        }
        return  text;
    }
}
