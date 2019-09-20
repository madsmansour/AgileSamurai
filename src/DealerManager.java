import java.util.ArrayList;

public class DealerManager {
    public static Hand hand() {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(1));
        cards.add(new Card(2));


        return new Hand(cards);

    }
}
