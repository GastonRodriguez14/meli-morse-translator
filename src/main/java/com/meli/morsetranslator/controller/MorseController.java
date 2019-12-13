package com.meli.morsetranslator.controller;

import com.meli.morsetranslator.dto.MessageDto;
import com.meli.morsetranslator.service.MorseService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/morse-translator")
public class MorseController {

    @Autowired
    private MorseService service;

    @ApiOperation(
            value = "TextTranslator",
            notes = "Translate from Morse to Text")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Human text", response = MessageDto.class),
    })
    @GetMapping(path="/morse-to-text/{morse}", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<MessageDto> getText(
            @ApiParam(value = "Morse code that will be translate", required = true)
            @PathVariable("morse") String morseString) {
        return ResponseEntity.ok(service.translate2Human(morseString));
    }

	@ApiOperation(
			value = "MorseTranslator",
			notes = "Translate from Text to Morse")
	@ApiResponses({
			@ApiResponse(code = 200, message = "Morse code", response = MessageDto.class),
	})
	@GetMapping(path="/text-to-morse/{text}", produces = APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<MessageDto> getMorse(
			@ApiParam(value = "Text that will translate", required = true)
			@PathVariable("text") String morseString) {
		return ResponseEntity.ok(service.translate2Morse(morseString));
	}
}

