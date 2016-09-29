
package uni.joel.deckard.logic;

import uni.joel.deckard.logic.Deck;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
    
    private Account account;
    
    @Before
    public void createAccount() {
        account = new Account("testAccount");
    }
    
    // Deck has a name, yet the name still has to be added. FIX!
    @Test
    public void addingDeckWorks() {
        Deck deck = new Deck("testDeck");
        account.addDeck("testDeck", deck);
    }
}
