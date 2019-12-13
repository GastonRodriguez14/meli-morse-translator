package com.meli.morsetranslator.service.impl;

import com.meli.morsetranslator.service.TranslationTable;
import org.springframework.stereotype.Service;

@Service
public class TranslationTableImpl implements TranslationTable {

    @Override
    public char[] getLetters() {
        char[] letters = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
        return letters;
    }

    @Override
    public String[] getMorseLetters() {
        String[] morseLetters = { "  ", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",  "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};
        return morseLetters;
    }
}

