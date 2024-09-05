CREATE TABLE flashcard.CARDS
(
    id       SERIAL PRIMARY KEY,
    question VARCHAR(255) NOT NULL,
    answer   VARCHAR(255) NOT NULL
)