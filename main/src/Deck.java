public class Deck {
    public static card[] popDeck() {
        int i = 0;
        card[] deck = new card[52];
        for (int suit = 1; suit <= 4; suit++) {
            for (int face = 1; face <= 13; face++) {
                deck[i] = (new card(face, suit));
                i++;
            }
        }
        return deck;}
}