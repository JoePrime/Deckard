package uni.joel.deckard.logic.cards;

/**
 * Testing card class used for testing the methods in class Card with concrete
 * objects.
 *
 * @author Joel
 */
public class TestCard extends Card {

    String name = "Testikortti";
    int mana = 5;
    String description = "This subclass of Card is used for testing the Card class.";
    /**
     * Constructor for TestCard.
     * @param name name
     * @param mana mana
     * @param desc description
     */
    public TestCard(String name, int mana, String desc) {
        super(name, mana, desc);
    }
    
}
