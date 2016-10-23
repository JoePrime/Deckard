![Linkki](http://yuml.me/fe3dd283)

[Game]++-2[Player]
[Deck]++-1..*[Card]
[Player]++-1[Deck]
[Player]++-1[Hand] 
[Hand]++-0..10[Card]
[Account]-*[Deck] 
