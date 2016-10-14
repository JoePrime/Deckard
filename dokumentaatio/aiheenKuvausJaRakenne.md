**Subject:** A card game based on deckbuilding.  
A two-player card game where the players draw cards from their decks, and using
those cards try to reduce their opponent's life points to zero. The emphasis
should be on the variety of different cards.  
Will include a graphical interface.  
Should also have customizable and saveable decks, but might not have enough time for that during javalabra, so at first everyone uses the same deck.
Even later it might be possible to add a simple AI player and a semi-automatic card cost balancing system.

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

**Sequence diagrams:**

Choosing the players' names and starting a new battle.
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
