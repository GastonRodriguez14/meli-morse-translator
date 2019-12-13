package com.meli.morsetranslator.service;

import com.meli.morsetranslator.dto.MessageDto;

public interface MorseService {

    MessageDto translate2Human(String textToString);

    MessageDto translate2Morse(String textToMorse);
}