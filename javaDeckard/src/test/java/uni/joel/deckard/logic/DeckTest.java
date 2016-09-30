package uni.joel.deckard.logic;

import uni.joel.deckard.logic.cards.Card;
import uni.joel.deckard.logic.Deck;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import uni.joel.deckard.logic.cards.AttackCard;

/**
 * Tests the Deck class.
*/
public class DeckTest {

    private Deck deck;
    private Card card;

    @Before
    public void createDeck() {
        this.deck = new Deck("deck");
        this.card = new AttackCard("test card", 0, "For testing decks");
    }
    
    @Test
    public void CreatingDeckWorks() {
        Deck testDeck = new Deck("test deck");
        assertEquals("test deck", testDeck.getName());
    }
            
    @Test
    public void AddingToDeckWorks() {
        deck.addCards(card, 6);
        assertEquals(6, deck.amountOfCard(card));
    }
    
    @Test
    public void AddingBadAmountDoesNotWork() {
        deck.addCards(card, 0);
        assertEquals(0, deck.amountOfCard(card));
        deck.addCards(card, -5);
        assertEquals(0, deck.amountOfCard(card));
    }
    
    @Test
    public void AddingExistingCardRaisesAmount() {
        deck.addCards(card, 5);
        deck.addCards(card, 8);
        assertEquals(13, deck.amountOfCard(card));
    }
    
    @Test
    public void RemovingCardWorks() {
        deck.addCards(card, 10);
        deck.removeCardAmount(card, 5);
        assertEquals(5, deck.amountOfCard(card));
        deck.removeCardAmount(card, 5);
        assertEquals(0, deck.amountOfCard(card));
    }
    
    @Test
    public void RemovingAllOfCardWorks() {
        deck.addCards(card, 1000);
        deck.removeCardAll(card);
        assertEquals(0, deck.amountOfCard(card));
    }
    
    @Test
    public void RemovingInexistantCardDoesNothing() {
        deck.removeCardAmount(card, 10);
        assertEquals(0, deck.amountOfCard(card));
        deck.removeCardAll(card);
        assertEquals(0, deck.amountOfCard(card));
    }
    
    @Test
    public void RemovingErronousAmountDoesNotWork() {
        deck.removeCardAmount(card, -5);
        assertEquals(0, deck.amountOfCard(card));
        deck.addCards(card, 10);
        deck.removeCardAmount(card, 0);
        assertEquals(10, deck.amountOfCard(card));
        deck.removeCardAmount(card, -1);
        assertEquals(10, deck.amountOfCard(card));
    }
}
