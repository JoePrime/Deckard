package uni.joel.deckard.ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import uni.joel.deckard.logic.Battle;
import uni.joel.deckard.logic.Player;
import uni.joel.deckard.logic.cards.AttackCard;
import uni.joel.deckard.logic.cards.Card;

public class BattleView implements Runnable {

    private JFrame frame;
    private Battle battle;
    Player p1;
    Player p2;

    JLabel player1Name;
    JLabel player1Armor;
    JLabel player1HP;
    JLabel player1Mana;
    JLabel player1ManaProduction;

    JLabel player2Name;
    JLabel player2Armor;
    JLabel player2HP;
    JLabel player2Mana;
    JLabel player2ManaProduction;

    /**
     * Creates a new Battle window for the given Battle.
     *
     * @param battle The battle the window is created for.
     */
    public BattleView(Battle battle) {
        this.frame = new JFrame();
        this.battle = battle;
        p1 = battle.getP1();
        p2 = battle.getP2();
    }

    @Override
    public void run() {
        frame.setPreferredSize(new Dimension(1100, 810));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(5, 1));
        JPanel upperStatusScreen = new JPanel(new GridLayout(1, 5));
        JPanel upperCardRow = new JPanel(new GridLayout(1, 12));
        JPanel middleField = new JPanel(new GridLayout(1, 1));
        JPanel lowerCardRow = new JPanel(new GridLayout(1, 12));
        JPanel lowerStatusScreen = new JPanel(new GridLayout(1, 5));

        // Create resource info screens for player 1
        player1Name = new JLabel();
        player1Name.setHorizontalAlignment(SwingConstants.CENTER);
        player1Armor = new JLabel();
        player1Armor.setHorizontalAlignment(SwingConstants.CENTER);
        player1HP = new JLabel();
        player1HP.setHorizontalAlignment(SwingConstants.CENTER);
        player1Mana = new JLabel();
        player1Mana.setHorizontalAlignment(SwingConstants.CENTER);
        player1ManaProduction = new JLabel();
        player1ManaProduction.setHorizontalAlignment(SwingConstants.CENTER);

        // Create resource info screens for player 2
        player2Name = new JLabel();
        player2Name.setHorizontalAlignment(SwingConstants.CENTER);
        player2Armor = new JLabel();
        player2Armor.setHorizontalAlignment(SwingConstants.CENTER);
        player2HP = new JLabel();
        player2HP.setHorizontalAlignment(SwingConstants.CENTER);
        player2Mana = new JLabel();
        player2Mana.setHorizontalAlignment(SwingConstants.CENTER);
        player2ManaProduction = new JLabel();
        player2ManaProduction.setHorizontalAlignment(SwingConstants.CENTER);

        // Update the info screens
        updatePlayerStatus(p1);
        updatePlayerStatus(p2);

        // Add player 1 info screens to the upper status screen
        upperStatusScreen.add(player1Name);
        upperStatusScreen.add(player1Armor);
        upperStatusScreen.add(player1HP);
        upperStatusScreen.add(player1Mana);
        upperStatusScreen.add(player1ManaProduction);
        
        // Add player 2 info screens to the lower status screen
        lowerStatusScreen.add(player2Name);
        lowerStatusScreen.add(player2Armor);
        lowerStatusScreen.add(player2HP);
        lowerStatusScreen.add(player2Mana);
        lowerStatusScreen.add(player2ManaProduction);

        upperCardRow.add(new JButton());
        upperCardRow.add(new JButton());
        upperCardRow.add(new JButton());
        upperCardRow.add(new JButton());
        upperCardRow.add(new JButton());
        upperCardRow.add(new JButton());
        upperCardRow.add(new JButton());
        upperCardRow.add(new JButton());
        upperCardRow.add(new JButton());
        upperCardRow.add(new JButton());
        upperCardRow.add(new JButton("<html><big>DECK</big></html>"));

        lowerCardRow.add(new JButton());
        lowerCardRow.add(new JButton());
        lowerCardRow.add(new JButton());
        lowerCardRow.add(new JButton());
        lowerCardRow.add(new JButton());
        lowerCardRow.add(new JButton());
        lowerCardRow.add(new JButton());
        lowerCardRow.add(new JButton());
        lowerCardRow.add(new JButton());
        lowerCardRow.add(new JButton());
        lowerCardRow.add(new JButton("<html><big>DECK</big></html>"));
                
        container.add(upperStatusScreen);
        container.add(upperCardRow);
        container.add(middleField);
        container.add(lowerCardRow);
        container.add(lowerStatusScreen);
    }

    public void updatePlayerStatus(Player px) {
        if (px == p1) {
            player1Name.setText("Player: " + px.getName());
            player1Armor.setText("Armor: " + Integer.toString(px.getArmor()));
            player1HP.setText("Hitpoints: " + Integer.toString(px.getHitpoints()));
            player1Mana.setText("Mana: " + Integer.toString(px.getMana()));
            player1ManaProduction.setText("Mana production: " + Integer.toString(px.getManaProduction()));
        }
        if (px == p2) {
            player2Name.setText("Player: " + px.getName());
            player2Armor.setText("Armor: " + Integer.toString(px.getArmor()));
            player2HP.setText("Hitpoints: " + Integer.toString(px.getHitpoints()));
            player2Mana.setText("Mana: " + Integer.toString(px.getMana()));
            player2ManaProduction.setText("Mana production: " + Integer.toString(px.getManaProduction()));
        }
    }
}
