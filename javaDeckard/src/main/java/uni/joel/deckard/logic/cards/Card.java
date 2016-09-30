
package uni.joel.deckard.logic.cards;

/**
 * Abstract Card class used a base for all the other card classes.
 * All cards have a name, a cost (mana) and a description.
 * @author Joel
 */
public abstract class Card {

    String name;
    int mana;
    String desc;
    
    public Card(String name, int mana, String desc) {
        this.name = name;
        this.mana = mana;
        this.desc = desc;
    }

    public void invoke() {
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
}
