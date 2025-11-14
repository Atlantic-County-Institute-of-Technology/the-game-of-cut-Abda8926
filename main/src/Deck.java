import java.util.*;
public class Deck {
    Random shuffler = new Random();
    card[] deck = new card[52];
    public card[] popDeck() {
        int i = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int face = 1; face <= 13; face++) {
                deck[i] = (new card(face, suit));
                i++;
            }
        }
        return deck;}
    
    public void shuffleDeck() {
        for(int i = 0; i < 52; i++) {
            int newPos = shuffler.nextInt(52);
            card temp = deck[i];
            deck[i] = deck[newPos];
            deck[newPos] = temp;
        }
    }

    public card fetchCard(int target){
        card ret = deck[target];
        return ret;
    }

    public String toString() {
        String output = " ";
        for (int i=0; i<52; i++){
            output =  deck[i] + "\n" + output;
        }
        return("Deck: \n" + output);
    }
}

