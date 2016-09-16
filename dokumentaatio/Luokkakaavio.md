![Linkki](http://yuml.me/884be79a)

[Peli]++-2[Pelaaja]
[Pakka]-[Kortti]
[note: Pakan korttimäärä päättämättä. Tili vaaditaan pakkojen tallentamiseen. {bg:cornsilk}]
[Pakkavarasto]-[Pakka]
[Pelaaja]-1[Pakka]
[Pelaaja]++-[Käsi]
[Käsi]-[Kortti]
[Tili]-[Pakka]
[Pelaaja]1-0..1[Tili] 
