package uni.joel.deckard.logic;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import uni.joel.deckard.logic.cards.TestCard;

public class HandTest {

    private Hand hand;
    private TestCard card1;
    private TestCard card2;

    @Before
    public void createNewHand() {
        hand = new Hand();
        card1 = new TestCard("A test card", 5, "For testing purposes.");
        card2 = new TestCard("Another test card", 5, "Also for testing purposes.");
    }

    @Test
    public void handIsEmptyAtBeginning() {
        assertThat(hand.getCards().size(), is(0));
    }

    @Test
    public void addingCardsWorksCorrectly() {
        hand.addCard(card1);
        hand.addCard(card2);
        hand.addCard(card2);
        assertThat(hand.amountOfCard(card1), is(1));
        assertThat(hand.amountOfCard(card2), is(2));
    }

    @Test
    public void removingCardsWorksCorrectly() {
        hand.addCard(card1);
        hand.addCard(card2);
        hand.addCard(card2);
        hand.removeCard(card1);
        hand.removeCard(card2);
        assertThat(hand.amountOfCard(card1), is(0));
        assertThat(hand.amountOfCard(card2), is(1));
    }

    @Test
    public void removingSeveralCardsWorksCorrectly() {
        hand.addCard(card2);
        hand.addCard(card2);
        hand.addCard(card2);
        hand.removeAmountOfCard(card2, 0);
        assertThat(hand.amountOfCard(card2), is(3));
        hand.removeAmountOfCard(card2, -5);
        assertThat(hand.amountOfCard(card2), is(3));
        hand.removeAmountOfCard(card2, 1);
        assertThat(hand.amountOfCard(card2), is(2));
        hand.removeAmountOfCard(card2, 3);
        assertThat(hand.amountOfCard(card2), is(0));
    }
}
