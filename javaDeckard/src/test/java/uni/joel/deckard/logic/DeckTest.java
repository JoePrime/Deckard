package uni.joel.deckard.logic;

import uni.joel.deckard.logic.Card;
import uni.joel.deckard.logic.Deck;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DeckTest {

    private Deck pakka;
    private Card kortti;

    @Before
    public void pakanLuonti() {
        this.pakka = new Deck("pakka");
        this.kortti = new Card("Testikortti", 0, "Pakkojen testaamiseen");
    }
    
    @Test
    public void pakanLuontiToimii() {
        Deck testipakka = new Deck("testipakka");
        assertEquals("testipakka", testipakka.getNimi());
    }
            
    @Test
    public void pakkaanLisaysToimii() {
        pakka.lisaaKortteja(kortti, 6);
        assertEquals(6, pakka.kortinMaara(kortti));
    }
    
    @Test
    public void epasopivanMaaranLisaysEiToimi() {
        pakka.lisaaKortteja(kortti, 0);
        assertEquals(0, pakka.kortinMaara(kortti));
        pakka.lisaaKortteja(kortti, -5);
        assertEquals(0, pakka.kortinMaara(kortti));
    }
    
    @Test
    public void samankortinLisaaminenKasvattaaMaaraa() {
        pakka.lisaaKortteja(kortti, 5);
        pakka.lisaaKortteja(kortti, 8);
        assertEquals(13, pakka.kortinMaara(kortti));
    }
    
    @Test
    public void kortinPoistoToimii() {
        pakka.lisaaKortteja(kortti, 10);
        pakka.poistaKorttia(kortti, 5);
        assertEquals(5, pakka.kortinMaara(kortti));
        pakka.poistaKorttia(kortti, 5);
        assertEquals(0, pakka.kortinMaara(kortti));
    }
    
    @Test
    public void kaikkienSamanKortinPoistoToimii() {
        pakka.lisaaKortteja(kortti, 1000);
        pakka.poistaKorttiaKaikki(kortti);
        assertEquals(0, pakka.kortinMaara(kortti));
    }
    
    @Test
    public void olemattomanKortinPoistoEiTeeMitaan() {
        pakka.poistaKorttia(kortti, 10);
        assertEquals(0, pakka.kortinMaara(kortti));
        pakka.poistaKorttiaKaikki(kortti);
        assertEquals(0, pakka.kortinMaara(kortti));
    }
    
    @Test
    public void virheArvoPoistoEiToimi() {
        pakka.poistaKorttia(kortti, -5);
        assertEquals(0, pakka.kortinMaara(kortti));
        pakka.lisaaKortteja(kortti, 10);
        pakka.poistaKorttia(kortti, 0);
        assertEquals(10, pakka.kortinMaara(kortti));
        pakka.poistaKorttia(kortti, -1);
        assertEquals(10, pakka.kortinMaara(kortti));
    }
}
