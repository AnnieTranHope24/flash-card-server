package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Deck;
import com.example.repos.DeckRepository;

public class DeckService {
    @Autowired
    private DeckRepository deckRepository;

    public List<Deck> getAllDecks(){
        return deckRepository.findAll();
    }

    public Deck saveDeck(Deck deck){
        return deckRepository.save(deck);
    }
}
