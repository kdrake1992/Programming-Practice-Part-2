import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand;

    public Hand(){
        this.hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void sort() {
        Collections.sort(hand);
    }

    public void print() {
        for(Card c : hand) {
            System.out.println(c);
        }
    }

    public void sortAgainstSuit() {
       Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }

    @Override
    public int compareTo(Hand o) {
        int one = 0;
        int two = 0;

        for (Card c : this.hand) {
            one += c.getValue();
        }

        for (Card cc : o.hand) {
            two += cc.getValue();
        }

        if (one < two) {
            return -1;
        }
        else if (one == two) {
            return 0;
        }
        else {
            return 1;
        }
    }

}
