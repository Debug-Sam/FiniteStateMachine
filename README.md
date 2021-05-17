# FiniteStateMachine
Finite State Machines zijn de basis voor veel simulaties en AI in bijvoorbeeld games. Zonder daar al te diep op in te gaan kunnen we ze gebruiken om de kracht van OO programmeren te tonen. Je kunt namelijk een FSM implementeren met stukken minder code en bijzonder flexibel door OO technieken toe te passen.

# UML
![image](https://user-images.githubusercontent.com/74404094/118486438-e80a8100-b719-11eb-9bcf-6c7010d9056c.png)

# hoe werkt de FSM

De FSM werkt als volgt. Ik heb een node class aangemaakt voor alle nodes. Deze nodes hebben een naam en een volgende node op basis van de letter A of B.
elke node heeft een switch functie dat als de letter uit de zin die is meegegeven een A is dat de node dan verwijst naar de volgende node.
Bijvoorbeeld Node s0 krijgt de letter A binnen dan verwijst die door naar node s2 enzovoorts.

Ook heb ik een class gemaakt voor de FSM. elke FSM heeft een naam een zin van letters en een lijst van de afgelopen nodes, wat uiteindelijk je antwoord is.
In de main definieer je de nodes en waar de nodes naar toe verwijzen in geval van een A of B, je definieert een FSM met een naam en vraagt de gebruiker voor input om daar een zin van te maken. 
Dan definieer je die zin in je FSM. vervolgens loopt de FSM door de zin heen en begint die bij een startpunt dat jij hebt aangegeven in ons geval node s0.
Dan kijkt die naar de afgelopen node waar we dan de volgende node uit op kunnen maken en die voeg je toe aan de lijst van volgende nodes. als de zin op is stopt de loop. 
en geeft die het antwoord terug

