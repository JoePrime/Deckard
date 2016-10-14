**Subject:** A card game based on deckbuilding.  
A two-player card game where the players draw cards from their decks, and using
those cards try to reduce their opponent's life points to zero. The emphasis
should be on the variety of different cards.  
Will include a graphical interface.  
Should also have customizable and saveable decks, but might not have enough time for that during javalabra, so at first everyone uses the same deck.
Even later it might be possible to add a simple AI player and a semi-automatic card cost balancing system.

**Structural Description:** The project has the class Game as its structural centerpiece. From game the LoginView object is called, which lets the players enter their names, creating new Player objects with these names. The players are then taken to the battle screen, which shows the players' cards and decks, health, armor, mana, manaproduction, turn number and skip turn button. A player can have 0-10 cards in their hands, 5 being the starting amount.

From here the players can choose the card they want to use next or skip their turn. Players' amount of cards in their hands can vary. Planned uses for the cards are reducing the opponent's health, armor or resources, or increasing your own ones. The different card classes all implement the Card superclass and its methods.

In the future the login screen will only ask for one players' name and take them to the main menu instead. From there the player can create, modify, delete and save customized decks and enter the battle with another player.

**Users:** Two players.

**Actions for all users:**

- Inputting your name
- Starting a game
- Drawing a card
  - Assumes that it's the player's turn.
- Using a card
  - Assumes that the player has enough mana to use the card.
  - Assumes that it's the player's turn.
- Quitting a game

![Linkki](http://yuml.me/da47c427)

[Peli]++-2[Pelaaja]
[Pakka]*-[Kortti]
[note: Pakan ja käden korttimäärä päättämättä. Tili vaaditaan pakkojen tallentamiseen. {bg:cornsilk}] 
[Pakkavarasto]1-*[Pakka]
 [Pelaaja]-1[Pakka]
 [Pelaaja]++-[Käsi] 
[Käsi]0..2-[Kortti]
[Tili]-[Pakka] 
[Pelaaja]1-0..1[Tili] 

**Sequence diagrams:**

Choosing the players' names and starting a new battle. (some method calls left out to reduce size)
![Linkki](https://www.websequencediagrams.com/cgi-bin/cdraw?lz=TWFpbi0-KmdhbWU6CgAHBgAHBSBuZXdHYW1lV2luZG93KCkKZ2FtZS0-KkxvZ2luc2NyZWVuOgANB1N3aW5nVXRpbGl0aWVzOiBpbnZva2VMYXRlcigAJAspCgAbDi0-bABBCyBydW4oKQoACAstPipKRnIAgQQIIAAGBigiAHwFIgAaEG5hbWVGaWVsZDE6IGNyZWF0ZUNvbXBvbmVudHMoKgAVGTIACyMAfQhzZXRWaXNpYmxlKHRydWUpClVzZXItLT4AbwxuYW1lMQAIETIAEwYyCgCBHAotAIFvDwAzBgCBDgoADBQyAIIPD3BsYXllcjE6AAIVMgAHEGJhdHRsAIJFB0IABwUoADoHLCAALAcp&s=default)

Main->*game:
Main->game: newGameWindow()
game->*Loginscreen:
game->SwingUtilities: invokeLater(Loginscreen)
SwingUtilities->loginscreen: run()
loginscreen->*JFrame: new JFrame("Login")
loginscreen->*nameField1: createComponents(*)
loginscreen->*nameField2: createComponents(*)
loginscreen->JFrame: setVisible(true)
User-->nameField1: name1
User-->nameField2: name2
nameField1-->loginscreen: name1
nameField2-->loginscreen: name2
loginscreen->*player1:
loginscreen->*player2:
loginscreen->*battle: new Battle(player1, player2)

Using an attack card with one in hand while in battle.
![Linkki](https://www.websequencediagrams.com/cgi-bin/cdraw?lz=TWFpbi0-cGxheWVyMTogdXNlQ2FyZChhdHRhY2tDYXJkKQoAFgcAHQkuaGFuZDogYW1vdW50b2YAGBgAIgUtAFELMQBACgBVCjogaW52b2tlKAB8BykKAHEKAIENC2dldE9wcG9uZW50KACBCAoAOw5vABoHAC4ULgAVCDogY2hhbmdlSGl0cG9pbnRzQnkoLURBTUFHRSkK&s=default)

Main->player1: useCard(attackCard)
player1->player1.hand: amountofCard(attackCard)
player1.hand-->player1: 1
player1->attackCard: invoke(player1)
attackCard->player1: getOpponent()
player1-->attackCard: opponent
attackCard->player1.opponent: changeHitpointsBy(-DAMAGE)
