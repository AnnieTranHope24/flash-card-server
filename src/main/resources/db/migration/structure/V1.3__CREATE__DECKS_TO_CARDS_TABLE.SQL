CREATE TABLE flashcard.DECKS_TO_CARDS
(
    deck_id BIGINT REFERENCES flashcard.DECKS(id),
    card_id BIGINT REFERENCES flashcard.CARDS(id)
)