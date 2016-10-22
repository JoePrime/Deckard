package uni.joel.deckard.logic;

import static org.hamcrest.CoreMatchers.is;
import uni.joel.deckard.logic.Player;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import uni.joel.deckard.logic.cards.Card;
import uni.joel.deckard.logic.cards.TestCard;

/**
 * Tests the Player class.
 *
 * @author Joel
 */
public class PlayerTest {

    private Player matti;
    private TestCard card;
    private TestCard card2;

    @Before
    public void createNewPlayer() {
        matti = new Player("Matti");
        card = new TestCard("A testcard", 5, "for testing purposes");
        card2 = new TestCard("Another testcard", 5, "for testing purposes");
    }

    @Test
    public void playerCreatedCorrectly() {
        assertEquals("Matti", matti.getName());
        assertEquals("game deck", matti.getDeck().getName());
    }

    @Test
    public void drawingCardWorksCorrectly() {
        Deck deck = matti.getDeck();
        deck.addCards(card, 5);
        assertTrue(matti.getHand().getCards().isEmpty());
        matti.drawCard();
        assertTrue(matti.getHand().getCards().contains(card));
    }

    @Test
    public void usingCardThatIsInHandWorks() {
        Deck deck = matti.getDeck();
        deck.addCards(card, 5);
        matti.drawCard();
        assertTrue(matti.getHand().getCards().contains(card));
        matti.useCard(card);
        assertTrue(matti.getHand().getCards().isEmpty());
    }

    @Test
    public void usingCardNotInHandDoesNotWork() {
        Deck deck = matti.getDeck();
        deck.addCards(card, 1);
        matti.drawCard();
        assertTrue(matti.getHand().getCards().contains(card));
        matti.useCard(card2);
        assertTrue(matti.getHand().getCards().contains(card));
        assertFalse(matti.getHand().getCards().contains(card2));
    }

    @Test
    public void addingToHandWorks() {
        matti.addToHand(card);
        assertTrue(matti.getHand().getCards().contains(card));
        assertFalse(matti.getHand().getCards().contains(card2));
        matti.addToHand(card2);
        assertTrue(matti.getHand().getCards().contains(card2));
    }

    @Test
    public void addingToDeckWorks() {
        matti.addToDeck(card);
        assertTrue(matti.getDeck().getCards().containsKey(card));
        assertFalse(matti.getDeck().getCards().containsKey(card2));
        matti.addToDeck(card2);
        assertTrue(matti.getDeck().getCards().containsKey(card2));
    }

    @Test
    public void changingHitpointsByWorksCorrectly() {
        assertThat(matti.getHitpoints(), is(Player.DEFAULTHITPOINTS));
        matti.changeHitpointsBy(10);
        assertThat(matti.getHitpoints(), is(Player.DEFAULTHITPOINTS + 10));
        matti.changeHitpointsBy(0);
        assertThat(matti.getHitpoints(), is(Player.DEFAULTHITPOINTS + 10));
        matti.changeHitpointsBy(-20);
        assertThat(matti.getHitpoints(), is(Player.DEFAULTHITPOINTS - 10));
        matti.changeHitpointsBy(120);
        assertThat(matti.getHitpoints(), is(Player.MAXHITPOINTS));
        matti.changeHitpointsBy(-200);
        assertThat(matti.getHitpoints(), is(0));
    }

    @Test
    public void changingHitpointsToWorksCorrectly() {
        matti.changeHitpointsTo(-50);
        assertThat(matti.getHitpoints(), is(Player.DEFAULTHITPOINTS));
        matti.changeHitpointsTo(200);
        assertThat(matti.getHitpoints(), is(Player.DEFAULTHITPOINTS));
        matti.changeHitpointsTo(77);
        assertThat(matti.getHitpoints(), is(77));
    }
}
