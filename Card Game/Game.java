//Tristan Webb tristan.webb@malad.us
//for CTE software development 1
//instructor Mr Gross

import java.util.*; //allows the use of arraylist and collections

public class Game {
 
    //where everything happens
    public static void main (String[] args){
        Deck deck = new Deck(); //create the deck
        //System.out.println(deck.toString()); //for debugging to see that deck created properly
        
        deck.shuffle(); //shuffle the deck
        //System.out.println(deck.toString()); //for debugging to see that deck shuffled properly

        //create players
        Player player1 = new Player("Jerald");
        Player player2 = new Player("Juan");
        Player player3 = new Player("Wesley");
        Player player4 = new Player("Bertha");
        Player player5 = new Player("Dawson");

        //deal hands
        deck.deal(player1, player2, player3, player4, player5);
        //System.out.println(deck.toString()); //for debugging to see that cards were dealt correctly

        //calculate scores
        player1.playerScore = player1.playerHand.Score();
        player2.playerScore = player2.playerHand.Score();
        player3.playerScore = player3.playerHand.Score();
        player4.playerScore = player4.playerHand.Score();
        player5.playerScore = player5.playerHand.Score();

        //print hands + scores
        System.out.println(player1.playerName + "'s hand: \n" + player1.playerHand.toString() + player1.playerName + "'s score: " + player1.playerScore + "\n");
        System.out.println(player2.playerName + "'s hand: \n" + player2.playerHand.toString() + player2.playerName + "'s score: " + player2.playerScore + "\n");
        System.out.println(player3.playerName + "'s hand: \n" + player3.playerHand.toString() + player3.playerName + "'s score: " + player3.playerScore + "\n");
        System.out.println(player4.playerName + "'s hand: \n" + player4.playerHand.toString() + player4.playerName + "'s score: " + player4.playerScore + "\n");
        System.out.println(player5.playerName + "'s hand: \n" + player5.playerHand.toString() + player5.playerName + "'s score: " + player5.playerScore + "\n");

        //determine winner
            ArrayList<Player> finalScores = new ArrayList<Player>(); //create an arrayList of players so we can compare scores
            
            //add players to arrayList
            finalScores.add(player1);
            finalScores.add(player2);
            finalScores.add(player3);
            finalScores.add(player4);
            finalScores.add(player5);

            Collections.sort(finalScores, new SortByScore()); //sort by highest to lowest score

            //print out the winner
            System.out.println(finalScores.get(0).playerName + " is the winner!");

    }

}

//Sorts Players by score from highest to lowest
class SortByScore implements Comparator<Player>{
        public int compare(Player a, Player b){
            return b.playerScore - a.playerScore;
        }
}