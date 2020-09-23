#Opdrachten Methoden 1
Competentie: _Ik kan methoden met argumenten gebruiken_.

De opdrachten kunnen gevonden worden in de losse modulen. 

## Samenvatting
Een methode is een vooraf-gedefinieerd stukje code waarmee je snel functionaliteit kan aanroepen. Een methode moet een unieke methodenaam hebben, waarbij het object waarop de methode wordt aangeroepen bepaalt waar een methode gedefinieerd moet worden.

Elke methode mag 0 of meer argumenten hebben van verschillende typen en moet afgesloten worden met een puntkomma (`;`).

Een voorbeeld van een methode-aanroep is:
```java
SaxionApp.printLine("This is how you invoke a method!", Color.YELLOW); 
```

De exacte werking van een methode-aanroep kan je lezen in de officiele Java documentatie (of `javadoc`).

## Introductie
Het uiteindelijke doel van programmeren is om de computer _iets te laten doen_ waarbij hopelijk dat iets is wat jij (de programmeur) ook wil. Computers zijn echter hele domme apparaten en kunnen van zichzelf eigenlijk maar vrij weinig dingen (vooral eigenlijk alleen maar rekenen). Eventuele verdere functionaliteit die je als programmeur wil gebruiken zal vrijwel altijd zelf geschreven moeten worden. Gelukkig voor ons is Java intussen erg volwassen en bevat een heleboel code die reeds geschreven is door anderen die wij nu kunnen gebruiken om (snel) een programma te kunnen ontwikkelen. Deze voorontwikkelde code wordt in Java ook wel _methoden_ genoemd. En in het begin van je leren programmeren ga je vooral methoden _gebruiken_.

Om het zelfs nog iets makkelijker te maken hebben wij de _SaxionApp_ ontwikkeld. In dit framework kan je heel eenvoudig tekst printen, lijnen en figuren tekenen en zelfs plaatjes laten zien. Wij zullen dit framework in deze module gebruiken om de meeste programmeerconcepten te introduceren. Het is vooral _niet_ de bedoeling dat je dit framework uit je hoofd gaat leren.. Het is een midel om te leren programmeren.

Het zal echter wel even wennen worden om dit framework te gebruiken. Deze module is dus ook vooral bedoeld om de SaxionApp beter te leren kennen!

## Uitleg 
Het meest eenvoudige voorbeeld van een methode in Java is een methode die je iets op het scherm laat weergeven. In het geval van de SaxionApp ziet dit er als volgt uit:

```java
SaxionApp.printLine("This will be printed"); 
```

Alle methode-aanroepen volgen eenzelfde structuur. Het laatste woord voor de haakjes (in dit geval `printLine`) is de methodenaam waarmee je de code kan aanroepen. Het stuk voor de methodenaam (in dit geval `SaxionApp`) is een verwijzing naar het object waarop de methode wordt aangeroepen. Hier gaan we later nog meer over leren, maar voor nu mag je onthouden dat dit gedeelte de _plek waar de methode is gedefinieerd_ bepaald. Meerdere programmeurs kunnen namelijk best dezelfde methodenaam willen gebruiken in hun code en het is erg onhandig als je een naam maar een keer mag gebruiken.

Het deel tussen de haken (`"This will be printed"`) noemen we het argument van een methode. Het argument kan over het algemeen van alles zijn, een getal, een stuk tekst en meer. Ook kan een methode meerdere argumenten hebben. In dit geval zullen de verschillende argumenten met een komma gescheiden worden. 

Zie bijvoorbeeld het voorbeeld hieronder:

```java 
SaxionApp.printLine("This will be written in RED", Color.RED);
```

De methode heeft hierboven 2 argumenten, namelijk de tekst `This will be written in RED` (tussen aanhalingstekens) en de kleur `Color.RED`.

Het laatste waar je op moet letten bij het gebruik van methoden is dat je een methode-aanroep altijd afsluit met een puntkomma (`;`). Met dit teken geef je aan dat de instructie voor de computer af en er geen andere informatie meer volgt.

Wat een methode precies doet is soms lastig in te schatten op basis van de methodenaam. Je kan wel een idee krijgen, maar soms wil je iets meer weten. In dit geval zal je de documentatie moeten lezen die een programmeur bij een methode heeft geschreven. De officiele manier waarop je documentatie in Java schrijft wordt ook wel `javadoc` genoemd. In deze module ga je dit soort documentatie leren lezen.

Voor nu is het echter handig om te weten dat IntelliJ je kan ook kan helpen met het snel vinden van de juiste methoden. Type maar eens (in je run-blok) `SaxionApp.` in. Je zal zien dat IntelliJ automatisch suggesties geeft met wat je zoal kan. Dit wordt ook wel _auto completion_ genoemd en is een functie waar je dankbaar gebruik van zal gaan maken in deze module.