package uni.joel.deckard.player;

import uni.joel.deckard.logic.Deck;
import uni.joel.deckard.logic.Hand;

public class Player {

    String name = "";
    Deck deck;
    Hand hand;
    int hitpoints = 50;
    int armor = 25;
    int mana = 10;
    int manaProduction = 3;

    public Player(String name) {
        this.name = name;
        deck = new Deck("game deck");
    }

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

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
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
