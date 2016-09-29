
package uni.joel.deckard.logic;

import uni.joel.deckard.logic.cards.Card;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {

    private Card card;
    
    @Test
    public void newCardCreatedCorrectly() {
        this.card = new Card("Warrior", 5, "Strikes the enemy.");
        assertEquals("Warrior", card.getName());
        assertEquals(5, card.getMana());
        assertEquals("Strikes the enemy.", card.getDesc());
    }
    
}
