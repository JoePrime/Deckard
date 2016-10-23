package uni.joel.deckard.logic;

import uni.joel.deckard.logic.cards.Card;
import java.lang.Math;

/**
 * Player has a name, their deck, their hand (if they are in battle), hitpoints,
 * armor, mana and manaRecovery which are all int values.
 *
 * @author Joel
 */
public class Player {

    String name = "";
    Deck deck;
    Hand hand;
    public static final int DEFAULTHITPOINTS = 50;
    public static final int DEFAULTARMOR = 25;
    public static final int MAXHITPOINTS = 100;
    public static final int MAXARMOR = 50;
    int hitpoints = DEFAULTHITPOINTS;
    int armor = 25;
    int mana = 10;
    int manaRecovery = 3;
    Player opponent;

    /**
     * Constructor for Player. Creates a new deck for the player called "game
     * deck" and gives the player a new hand.
     *
     * @param name The name that the player gets.
     */
    public Player(String name) {
        this.name = name;
        deck = new Deck("game deck");
        hand = new Hand();
    }

    /**
     * Draws a new random card from the deck and adds it to the player's hand.
     * Does nothing if player's hand is already full.
     *
     * @return TRUE if the card was added to the hand, FALSE otherwise.
     */
    public boolean drawCard() {
        if (hand.getSize() < Hand.MAXHANDSIZE) {
            Card newCard = deck.newCard();
            hand.addCard(newCard);
            return true;
        }
        return false;
    }

    /**
     * Uses the specified card. Effects depend on the card.
     *
     * @param card The card to be used.
     * @return True if the card was used successfully, otherwise false.
     */
    public boolean useCard(Card card) {
        if (hand.containsCard(card)) {
            if (mana >= card.getManaCost()) {
                card.invoke(this);
                hand.removeCard(card);
                changeManaBy(-card.getManaCost());
                return true;
            }
        }
        return false;
    }

    /**
     * Adds the given card to hand.
     *
     * @param card The card to be added to hand.
     */
    public void addToHand(Card card) {
        hand.addCard(card);
    }

    /**
     * Adds the given card to deck.
     *
     * @param card The card to be added to deck.
     */
    public void addToDeck(Card card) {
        deck.addCards(card, 1);
    }

    @Override
    public String toString() {
        return "Player: " + name;
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

    /**
     * Changes hitpoints to given amount. Does nothing if amount is not between
     * 0 and Player.maxHitpoints.
     *
     * @param hitpoints The new value to be given to the player's hitpoints.
     */
    public void changeHitpointsTo(int hitpoints) {
        if (hitpoints >= 0 && hitpoints <= MAXHITPOINTS) {
            this.hitpoints = hitpoints;
        }
    }

    /**
     * Changes hitpoints by the given amount. Amount can be positive or
     * negative. Hitpoints will be lowered if amount is negative and vice versa.
     * If hitpoints are tried to lower or raise too much, instead changes them
     * to 0 or Player.maxHitpoints, respectively.
     *
     * @param amount The amount that the player's hitpoints should be changed
     * by.
     */
    public void changeHitpointsBy(int amount) {
        if (amount < 0) {
            hitpoints = Math.max(0, hitpoints + amount);
        } else {
            hitpoints = Math.min(MAXHITPOINTS, hitpoints + amount);
        }
    }

    /**
     * Changes armor by the given amount. Amount can be positive or negative.
     * Armor will be lowered if the amount is negative and vice versa. If armor
     * is tried to lower or raise too much, instead changes it to 0 or Player.
     * maxArmor, respectively.
     *
     * @param amount The int amount the player's armor should be changed by.
     */
    public void changeArmorBy(int amount) {
        if (amount < 0) {
            armor = Math.max(0, armor + amount);
        } else {
            armor = Math.min(MAXARMOR, armor + amount);
        }
    }

    /**
     * Changes the player's mana by the given amount. Checks that the mana does
     * not go below zero.
     *
     * @param amount The amount the mana should be changed by.
     */
    public void changeManaBy(int amount) {
        this.mana = Math.max(this.mana + amount, 0);
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

    public int getManaRecovery() {
        return manaRecovery;
    }

    public void setManaRecovery(int manaRecovery) {
        this.manaRecovery = manaRecovery;
    }

    public Player getOpponent() {
        return this.opponent;
    }

    public void setOpponent(Player newOpponent) {
        this.opponent = newOpponent;
    }

}
