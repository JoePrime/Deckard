package uni.joel.deckard.logic;

import uni.joel.deckard.logic.Deck;
import uni.joel.deckard.logic.Hand;
import uni.joel.deckard.logic.cards.Card;
import java.lang.Math;

/**
 * Player has a name, their deck, their hand (if they are in battle), hitpoints,
 * armor, mana and manaproduction which are all int values.
 *
 * @author Joel
 */
public class Player {

    String name = "";
    Deck deck;
    Hand hand;
    int hitpoints = 50;
    int armor = 25;
    int mana = 10;
    int manaProduction = 3;
    Player opponent;

    public Player(String name) {
        this.name = name;
        deck = new Deck("game deck");
    }

    // Must add card comparator!!
    public boolean useCard(Card card) {
        if (hand.contains(card)) {
            card.invoke();
            return true;
        }
        return false;
    }

    public String toString() {
        return "Player: " + name;
    }

    public Player getOpponent() {
        return opponent;
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }
    
    public int raiseHitpoints(int amount) {
        hitpoints = Math.min(hitpoints + amount, 100);
        return hitpoints;
    }
    
    public int lowerHitpoints(int amount) {
        hitpoints = Math.max(hitpoints + amount, 0);
        return hitpoints;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getManaProduction() {
        return manaProduction;
    }

    public void setManaProduction(int manaProduction) {
        this.manaProduction = manaProduction;
    }

}
