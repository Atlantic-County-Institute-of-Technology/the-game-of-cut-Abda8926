public class card {
    public final int face;
    private final int suit;
    private final String[] faces = {null, "Ace", "2", "3", "4", "5", "7" ,"8", "9", "10", "Jack", "Queen", "King"};
    private final String[] suits = {null, "♠", "♥", "♣", "♦" };

    public card(int face, int suit) {
        this.face = face;
        this.suit = suit;
    }

    public int getFace() {
        return faces[face];
    }

    public int getSuit() {
        return suits[suit];
    }
}

