
package uni.joel.deckard.logic.cards;

public class Card {

    String name;
    int mana;
    String desc;
    
    public Card(String name, int mana, String desc) {
        this.name = name;
        this.mana = mana;
        this.desc = desc;
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
