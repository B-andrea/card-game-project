# ♣️ A Game Of Snap ♣️

--- 

Welcome to the command-line version of Snap! This is a fast-paced card game where players take turns placing cards onto a central pile. The objective is simple: when two consecutive cards in the pile have the same symbol (e.g., two Kings or two 5s), the player must type "Snap!" to win the game.

## ♢ Basic Rules Of The Game:

---

 In this Java implementation of Snap, the game mechanics will be simulated with cards shuffled and each player taking their turn. The game will also track when a Snap occurs, allowing players to claim their chance to win the game.

---

1. Players must press enter on the keyboard to draw a card from the deck.

2. Each player will be prompted to draw a card when it is their turn.

3. When two consecutive cards in the central pile match in symbol, the player must race to type "Snap" in the console.

4. The player to correctly call 'snap' within 2 seconds, wins the game. If it is not typed in time, the player loses and the game ends.

---

This Java implementation allows you to play Snap in a text-based format. Test your reaction time and enjoy the challenge of beating your opponent to the snap!

---

## ♢ Project Breakdown

### Stage 1:

This stage focuses on creating classes for a deck of cards, including a CardGame class to manage the deck and a Card class to represent individual cards.

- [x] Create a Card Class
- [x] String suit to represent the suit of the card ("♥", "♦", "♣", "♠")
- [x] String symbol to represents the value of the card ("2", "3", "4", ..., "K", "A")
- [x] int value to represent the numerical value of the card (2, 3, 4, ..., 14)
- [x] Constructor to initialize the card with suit, symbol, and value
- [x] Method to return a string description of the card
- [x] An array list to store the deck of 52 cards
- [x] String name to represent the name of the game
- [x] Constructor to initialize the game with a name and populate the deck
- [x] A method to list all cards in the deck - for each card in deckOfCards, print card
- [x] Method to create 52 card objects and add them to deckOfCards array. Generate all combinations of suits, symbols, and values.

---

### Stage 2:

This stage will implement core functionality for the CardGame class, including methods for dealing cards, sorting the deck by number, sorting the deck by suit, and shuffling the deck.

- [x] A method to take the card from the top of the deck and return it. Use ArrayList method to remove and return the first element
- [x] Sort deck in number order - The sortDeckInNumberOrder() method sorts the deckOfCards list by the card values. It then returns the newly sorted deck.
- [x] A method to sort the deck into suits. The sortDeckIntoSuits() method sorts the deck by suits in the order of hearts, diamonds, clubs, and spades. Within each suit, the cards are sorted by their value. The sorted deck is then returned.
- [x] A method to shuffle the deck into a random order - Call the shuffle() method to take care of randomly rearranging the elements in the deckOfCards list.

---

### Stage 3:

This stage creates a Snap class, which extends the CardGame class and allows for playing the Snap game based on the rules.

- [x] Snap class extends CardGame - inheriting methods like shuffleDeck() and dealCard().
- [x] Two instance variables: isGameOver (to track if the game has ended) and previousCard (to track the cards dealt in each round).
- [x] The constructor calls the superclass constructor (super(name)) to initialize the game name.
- [x] Prompt the player to press enter to take their turn.
- [x] Dealing a Card: It deals the top card from the deck and assigns it to 'nextCard'.
- [x] Snap Check: It compares the current card with the previous card. If the symbols are the same (i.e., the two cards match in symbol), it declares the player the winner and ends the game by setting isGameOver to true.
- [x] Update the previous card to be the current card for the next round - previousCard = nextCard.





