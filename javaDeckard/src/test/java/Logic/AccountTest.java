
package Logic;

import Logic.Account;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
    
    private Account tili;
    
    @Before
    public void luoTili() {
        tili = new Account("testitili");
    }
    
    // pakalla on nimi, mutta silti nimi pitää lisätä. Päällekkäisyyttä. KORJAA!
    @Test
    public void pakanLisaysOnnistuu() {
        Deck pakka = new Deck("testipakka");
        tili.lisaaPakka("testipakka", pakka);
    }
}
