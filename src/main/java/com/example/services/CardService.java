package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repos.CardRepository;

@Service
public class CardService {
    @Autowired
    CardRepository cardRepository;
}
