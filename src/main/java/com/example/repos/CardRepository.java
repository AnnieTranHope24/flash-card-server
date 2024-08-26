package com.example.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Card;

public interface CardRepository extends JpaRepository<Card, Long>{
    List<Card> findByDeckId(Long deckId);
} 
