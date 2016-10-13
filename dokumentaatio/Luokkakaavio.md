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
