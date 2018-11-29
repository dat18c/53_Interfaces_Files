# 53_Interfaces

## Agenda
- Opsamling på Terning og Ludoterning
- Interfaces

## Øvelser
Lav et interface med en abstrakt metode, der bestemmer om terningen er en snydeterning `setCheat(boolean cheat)`

En snydeterning fungerer lidt forskelligt afhængigt af, om det er en almindelig ternining eller en LudoTerning:
* En snyde-Terning slår 6 hver gang
* mens en snyde-ludoterningen slår 6 hver gang

Implementer metoden i klasserne og brug terningerne i en arrayliste. Lad nogle af dem være snydeterninger vha. `minTerning.setCheat(true);`
