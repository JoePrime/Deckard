
package uni.joel.deckard.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import uni.joel.deckard.logic.cards.AttackCard;

/**
 * Tests the AttackCard class.
 * 
 * @author Joel
 */

public class AttackCardTest {

    private AttackCard card;
    
    @Before
    public void createNewCard() {
        this.card = new AttackCard("Warrior", 5, "Strikes the enemy.");
    }
    
    @Test
    public void newCardCreatedCorrectly() {
        assertEquals("Warrior", card.getName());
        assertEquals(5, card.getMana());
        assertEquals("Strikes the enemy.", card.getDesc());
    }
    
    // Must add card comparer to class Card!!
    // INCOMPLETE
    @Test
    public void reducesOpponentsHealthCorrectly() {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        Battle battle = new Battle(player1, player2);
        player1.getDeck().addCards(card, 1);
        
    }
}
