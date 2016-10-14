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

Sekvenssikaavio, käyttötapauksena pelaajien nimien syöttäminen ja uuden taistelun aloittaminen
![Linkki](https://www.websequencediagrams.com/cgi-bin/cdraw?lz=TWFpbi0-KmdhbWU6CgAHBgAHBSBuZXdHYW1lV2luZG93KCkKZ2FtZS0-KkxvZ2luc2NyZWVuOgANB1N3aW5nVXRpbGl0aWVzOiBpbnZva2VMYXRlcigAJAspCgAbDi0-bABBCyBydW4oKQoACAstPipKRnIAgQQIIAAGBigiAHwFIgAbDwA9DWNyZWF0ZUNvbXBvbmVudHMoKgBJDwBPCHNldFZpc2libGUodHJ1ZSkKVXNlci0tPm5hbWVGaWVsZDE6IG5hbWUxAAgRMgATBjIKACEKLQCBQQ8AMwYAKAoADBQyAIFhD3BsYXllcjE6AAIVMgAHEGJhdHRsAIIXB0IABwUoADoHLCAALAcp&s=default)
