//Tristan Webb tristan.webb@malad.us
//for CTE software development 1
//instructor Mr Gross

import java.util.*; //allows the use of ArrayList

public class Hand {

    ArrayList<Card> hand = new ArrayList<Card>(); //creates an arraylist of cards for a hand

    public int Score (){
        //calculate the total points in the hand
        int score = 0;

        for (Card cc:hand){
            score = score + cc.value;
        }

        return score; //returns score
    }

    public String toString(){
        //returns a String that shows what cards are in the hand
        String inHand = "";

        for (int i = 0; i<hand.size(); i++){
            inHand = inHand + hand.get(i).name + " " + hand.get(i).suit + " " + hand.get(i).value + "\n";
        }

        return inHand; //returns String of the cards in the hand
    }
    
}
