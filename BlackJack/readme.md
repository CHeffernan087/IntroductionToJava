# Black Jack

<p align="middle"> 
<img width ="300px" src="https://www.pngkit.com/png/full/154-1547540_blackjack-en-lnea-blackjack-blackjack.png" />
<p>

### Basic implementation

- Store the cards 1-11 in an array list (add the number 10 5 times)
- Deal two cards to the player
- Make sure to remove the cards you have dealt from the deck!
- if the users total is 21 they win
- if the users total is < 21 they may play the game
- while the user is playing they may ask for another card. If the users total is > 21 they lose. A user may stop asking for cards at any point.
- when the user stops asking for cards, deal 2 cards to the computer. Whoever has a bigger total wins.

### Next Step - make the dealer better

- After the user 'sticks' (stops asking for cards), the dealer gets 2 cards. While the dealers total is < the user total , the dealer should always ask for another card until the dealer either has a bigger total or exceeds 21 and loses.

### Flesh out the deck
- Create a card class
- every card should have a number and a suite (diamond, club etc)
- adapt the game so that we are now playing with 52 cards and every card has a suite

### Deck class
- change the deck from being an array list to being a class
- the deck should have methods such as draw card
- remove card from deck etc

### Play with friends!
- make the game multiplayer. Deal in more than one human player 
