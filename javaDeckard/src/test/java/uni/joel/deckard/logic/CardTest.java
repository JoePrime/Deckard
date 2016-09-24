
package uni.joel.deckard.logic;

import uni.joel.deckard.logic.cards.Card;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {

    private Card kortti;
    
    @Test
    public void korttiLuodaanOikein() {
        this.kortti = new Card("Soturi", 5, "Iskee vihollista.");
        assertEquals("Soturi", kortti.getNimi());
        assertEquals(5, kortti.getMana());
        assertEquals("Iskee vihollista.", kortti.getKuvaus());
    }
    
}
