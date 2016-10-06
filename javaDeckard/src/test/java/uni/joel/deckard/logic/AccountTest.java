
package uni.joel.deckard.logic;

import static org.hamcrest.CoreMatchers.*;
import uni.joel.deckard.logic.Deck;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests the Account class.
 * 
 * @author Joel
 */
public class AccountTest {
    
    private Account account;
    
    @Before
    public void createAccount() {
        account = new Account("testAccount");
    }

    @Test
    public void newAccountCreatedCorrectly() {
        assertThat(account.getName(), is("testAccount"));
        assertTrue(account.getDecks().isEmpty());
    }
    @Test
    public void addingDeckWorks() {
        Deck deck = new Deck("testDeck");
        account.addDeck("testDeck", deck);
        assertThat(account.getDecks().get("testDeck"), is(deck));
    }
}
