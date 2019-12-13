package com.meli.morsetranslator.service.impl;

import com.meli.morsetranslator.dto.MessageDto;
import com.meli.morsetranslator.service.MorseService;
import com.meli.morsetranslator.service.TranslationTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MorseServiceImpl implements MorseService {


    @Autowired
    private TranslationTable translationTable;

    @Override
    public MessageDto translate2Human(String textToString) {

        String newStringText = "";
        String [] textToStringSplitted = textToString.split("  ");
        for (int i = 0; i < textToStringSplitted.length; i++) {

            String [] textToStringSplitted_ = textToStringSplitted[i].split(" ");


            for (int k = 0; k < textToStringSplitted_.length; k++) {
                for (int j = 0; j < 37; j++) {
                    if (textToStringSplitted_[k].equals(translationTable.getMorseLetters()[j])) {
                        newStringText += translationTable.getLetters()[j];
                        newStringText += " ";

                        break;
                    }
                }
            }

        }
        return new MessageDto(newStringText);
    }

    @Override
    public MessageDto translate2Morse(String textToMorse) {
        textToMorse = textToMorse.toLowerCase();
        String  newMorseText = "";
        for (int i = 0; i < textToMorse.length(); i++) {
            for (short j = 0; j < 37; j++) {
                if (textToMorse.charAt(i) == translationTable.getLetters()[j]) {
                    newMorseText += translationTable.getMorseLetters()[j];
                    newMorseText += " ";

                    break;
                }
            }
        }

        return new MessageDto(newMorseText);
    }

}

