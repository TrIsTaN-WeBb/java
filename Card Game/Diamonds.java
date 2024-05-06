//Tristan Webb tristan.webb@malad.us
//for CTE software development 1
//instructor Mr Gross

public class Diamonds extends Card { 

    //constructor method
    public Diamonds (String name, int value, String suit, Boolean inDeck){
        super(name, value+1, suit, inDeck); //value increases by one if the card is a Diamond
    }
} 
