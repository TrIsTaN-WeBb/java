//Tristan Webb tristan.webb@malad.us
//for CTE software development 1
//instructor Mr Gross

import java.util.*; //allows the use of arraylist

public class Deck {
    ArrayList<Card> deck = new ArrayList<Card>(); //creates an arraylist of cards to be a deck

    //constructor method
    public Deck(){
        //call create cards method for each suit
        createCards("Hearts");
        createCards("Diamonds");
        createCards("Spades");
        createCards("Clubs");
    }

    //creates cards
    public void createCards(String suit){
        String name;
        int value;

        //loop through A (i=1) to K (i=13) to assign value and name, then add to deck based on suit
        for (int i=1;i<14;i++){
            value = i; //sets the value to the place in the loop
            
            //determines the name of the card based on the place in the loop
            if (i==1){
                name = "A";
            } else if (i==11){
                name = "J";
            } else if (i==12){
                name = "Q";
            } else if (i==13){
                name = "K";
            } else{
                name = Integer.toString(i); //all other cards are named based on the place in the loop
            }

            //checks to see what suit is being created and adds the card to the deck
            if (suit == "Hearts"){
                deck.add(new Hearts(name, value, suit, true));
            } else if (suit == "Diamonds"){
                deck.add(new Diamonds(name, value, suit, true));
            } else if (suit == "Spades"){
                deck.add(new Spades(name, value, suit, true));
            } else if (suit == "Clubs"){
                deck.add(new Clubs(name, value, suit, true));
            } else{
                System.out.println("Error in create cards method"); //shouldn't ever happen, but exists to finish the if/else statement
            }
        }
    }

    public void shuffle (){
        //shuffles the deck
        Collections.shuffle(deck);
    }

    public void deal(Player player1, Player player2, Player player3, Player player4, Player player5){
        //create hands
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        Hand hand3 = new Hand();
        Hand hand4 = new Hand();
        Hand hand5 = new Hand();

        //fill hands and set cards' inDeck = false
        for (int i=0; i<25;i+=5){
            hand1.hand.add(deck.get(i));
            deck.get(i).inDeck=false;

            hand2.hand.add(deck.get(i+1));
            deck.get(i+1).inDeck=false;

            hand3.hand.add(deck.get(i+2));
            deck.get(i+2).inDeck=false;

            hand4.hand.add(deck.get(i+3));
            deck.get(i+3).inDeck=false;

            hand5.hand.add(deck.get(i+4));
            deck.get(i+4).inDeck=false;
        }

        //assign to players
        player1.playerHand = hand1;
        player2.playerHand = hand2;
        player3.playerHand = hand3;
        player4.playerHand = hand4;
        player5.playerHand = hand5;
        
    }

    public String toString(){
        //creates a String containing each card in the deck, separated by a line break
        String deckString = "";

        for (int i = 0; i < deck.size(); i++){
            deckString = deckString + deck.get(i).name + " " + deck.get(i).suit + " " + deck.get(i).value + " " + deck.get(i).inDeck + "\n";
        }

        return deckString;
    }
}
