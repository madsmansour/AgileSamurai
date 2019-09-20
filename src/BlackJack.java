public class BlackJack {

    public boolean DealerWins(Hand playerHand) {
        Hand h1 = playerHand;
        int playerHandValue = 0;
        for(Card c : h1)
        {
            playerHandValue += Value(c.Value, h1);
        }
        Hand h2 = DealerManager.hand();
        int dealerHandValue= 0;

        for (Card c : h2)
        {
            dealerHandValue += Value(c.Value, h2);
        }
        if (dealerHandValue >= playerHandValue) {
            return true;
        } else
            return false;
        return false;
    }
public int Value(int value, Hand hand) {
        return value;
}

}