package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Card;
import com.example.repos.CardRepository;

@Service
public class CardService {
    @Autowired
    CardRepository cardRepository;

    public List<Card> getCardsByDeck(Long deckId){
        return cardRepository.findByDeckId(deckId);
    }

    public Card saveCard(Card card){
        return cardRepository.save(card);
    }

    public void deleteCard(Long id) {
        cardRepository.deleteById(id);
    }
}
