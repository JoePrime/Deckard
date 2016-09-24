package uni.joel.deckard;

import uni.joel.deckard.player.Player;
import java.util.Scanner;
import uni.joel.deckard.logic.*;

public class Main {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        Player pelaaja1 = new Player(lukija.nextLine());
        Player pelaaja2 = new Player(lukija.nextLine());
    }
}
