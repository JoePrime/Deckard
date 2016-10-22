package uni.joel.deckard.logic;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import uni.joel.deckard.logic.cards.AttackCard;
import uni.joel.deckard.logic.cards.DefenseCard;

/**
 * Tests the AttackCard class.
 *
 * @author Joel
 */
public class AttackCardTest {

    private AttackCard card;

    @Before
    public void createNewCard() {
        card = new AttackCard("Warrior", 5, "Strikes the enemy.");
    }

    @Test
    public void newCardCreatedCorrectly() {
        assertEquals("Warrior", card.getName());
        assertEquals(5, card.getMana());
        assertEquals("Strikes the enemy.", card.getDescription());
    }

    @Test
    public void reducesOpponentsHealthCorrectly() {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        Battle battle = new Battle(player1, player2);
        player1.addToHand(card);
        player1.addToHand(card);
        player1.addToHand(card);
        assertThat(player2.getArmor(), is(Player.DEFAULTARMOR));
        player1.useCard(card);
        assertThat(player2.getArmor(), is(Player.DEFAULTARMOR - AttackCard.DAMAGE));
        player1.useCard(card);
        player1.useCard(card);
        assertThat(player2.getArmor(), is(Math.max(0, Player.DEFAULTARMOR - 3*AttackCard.DAMAGE)));
        assertThat(player2.getHitpoints(), is(Math.min(Player.DEFAULTHITPOINTS,
                Player.DEFAULTHITPOINTS - (3*AttackCard.DAMAGE - Player.DEFAULTARMOR))));
    }

    // Can't compare different classes? First commented line doesn't work.
    // Neither do the assertEquals or assertThat methods.
    @Test
    public void equalsWorksCorrectly() {
        AttackCard identicalCard = new AttackCard("Warrior", 5, "Strikes the enemy.");
        AttackCard differentName = new AttackCard("Warriori", 5, "Strikes the enemy.");
        AttackCard differentMana = new AttackCard("Warrior", 4, "Strikes the enemy.");
        AttackCard differentDesc = new AttackCard("Warrior", 5, "Strikes the enemy");
        DefenseCard differentClass = new DefenseCard("Warrior", 5, "Strikes the enemy.");

        assertThat(identicalCard, is(equalTo(card)));
        assertThat(card, is(not(equalTo(differentName))));
        assertThat(card, is(not(equalTo(differentMana))));
        assertThat(card, is(not(equalTo(differentDesc))));
        assertThat(card, is(not(equalTo(differentClass))));
    }
}
