package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Deck;
import com.example.services.DeckService;

@RestController
@RequestMapping("/api/decks")
public class DeckController {
    @Autowired
    DeckService deckService;

    @GetMapping
    public List<Deck> getAllDecks(){
        return deckService.getAllDecks();
    }

    @PostMapping
    public Deck createDeck(@RequestBody Deck deck){
        return deckService.saveDeck(deck);
    }
}
