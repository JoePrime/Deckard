package uni.joel.deckard.logic;

import static org.hamcrest.CoreMatchers.*;
import uni.joel.deckard.logic.cards.Card;
import uni.joel.deckard.logic.Deck;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import uni.joel.deckard.logic.cards.AttackCard;
import uni.joel.deckard.logic.cards.TestCard;

/**
 * Tests the Deck class.
*/
public class DeckTest {

    private Deck deck;
    private Card card;
    private Card card2;

    @Before
    public void createDeck() {
        this.deck = new Deck("deck");
        this.card = new AttackCard("test card", 0, "For testing decks.");
        this.card2 = new TestCard("Also a test card", 5, "Also for testing purposes.");
    }
    
    @Test
    public void creatingDeckWorks() {
        Deck testDeck = new Deck("test deck");
        assertEquals("test deck", testDeck.getName());
    }
            
    @Test
    public void addingToDeckWorks() {
        deck.addCards(card, 6);
        deck.addCards(card, 1);
        assertEquals(7, deck.amountOfCard(card));
    }
    
    @Test
    public void addingBadAmountDoesNotWork() {
        deck.addCards(card, 0);
        assertEquals(0, deck.amountOfCard(card));
        deck.addCards(card, -5);
        assertEquals(0, deck.amountOfCard(card));
    }
    
    @Test
    public void addingExistingCardRaisesAmount() {
        deck.addCards(card, 5);
        deck.addCards(card, 8);
        assertEquals(13, deck.amountOfCard(card));
    }
    
    @Test
    public void removingCardWorks() {
        deck.addCards(card, 10);
        deck.removeCardAmount(card, 5);
        assertEquals(5, deck.amountOfCard(card));
        deck.removeCardAmount(card, 5);
        assertEquals(0, deck.amountOfCard(card));
    }
    
    @Test
    public void removingAllOfCardWorks() {
        deck.addCards(card, 1000);
        deck.removeCardAll(card);
        assertEquals(0, deck.amountOfCard(card));
    }
    
    @Test
    public void removingInexistantCardDoesNothing() {
        deck.removeCardAmount(card, 10);
        assertEquals(0, deck.amountOfCard(card));
        deck.removeCardAll(card);
        assertEquals(0, deck.amountOfCard(card));
    }
    
    @Test
    public void removingErronousAmountDoesNotWork() {
        deck.removeCardAmount(card, -5);
        assertEquals(0, deck.amountOfCard(card));
        deck.addCards(card, 10);
        deck.removeCardAmount(card, 0);
        assertEquals(10, deck.amountOfCard(card));
        deck.removeCardAmount(card, -1);
        assertEquals(10, deck.amountOfCard(card));
    }
    
    @Test
    public void emptyingTheDeckWorks() {
         deck.addCards(card, 6);
         deck.empty();
         assertTrue(deck.isEmpty());
    }
    
    @Test
    public void drawingNewCardWorks() {
        deck.addCards(card, 5);
        deck.addCards(card2, 3);
        Card newCard = deck.newCard();
        if (newCard.equals(card)) {
            assertTrue(newCard.equals(card));
        } else {
            assertTrue(newCard.equals(card2));
        }
    }
}
