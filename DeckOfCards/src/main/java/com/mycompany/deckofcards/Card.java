package com.mycompany.deckofcards;

public class Card {
    private String suit; //clubs, diamonds, hearts, spades
    private String value; // A Т, 2, 3, 4, 5, 6, 7, 8, 9, 10, J В, Q Д, K К

    Card(String suit, String value) {
        
    }
    
    public String getSuit() {
        return this.suit;
    };
    
    public String getValue() { 
        return this.value;
    }
}
